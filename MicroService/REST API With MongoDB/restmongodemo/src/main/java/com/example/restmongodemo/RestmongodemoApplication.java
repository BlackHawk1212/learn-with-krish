package com.example.restmongodemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class RestmongodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestmongodemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate){
        return args -> {
            Address address = new Address(
                    "Sri Lanka",
                    "11011",
                    "Ragama"
            );
            String email = "nimeshmendis@gmail.com";
            Student student = new Student(
                    "Nimesh",
                    "Mendis",
                    email,
                    Gender.MALE,
                    address,
                    List.of("Computer Science","Network"),
                    BigDecimal.TEN,
                    LocalDateTime.now()
            );

//            usingMongoTemplateAndQuery(repository,mongoTemplate,email,student);

            repository.findStudentByEmail(email)
                    .ifPresentOrElse(s -> System.out.println(s + " Already Exists"), ()->{
                        System.out.println("Inserting Student " + student);
                        repository.insert(student);
                    });

        };
    }

    private void usingMongoTemplateAndQuery(StudentRepository repository, MongoTemplate mongoTemplate,String email,Student student) throws IllegalAccessException {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").is(email));

        List<Student> students = mongoTemplate.find(query,Student.class);

        if(students.size() > 1){
            throw new IllegalAccessException("Found many students with email" + email);
        }

        if(students.isEmpty()){
            System.out.println("Inserting Student " + student);
            repository.insert(student);
        } else {
            System.out.println(student + " Already Exists");
        }
    }

}
