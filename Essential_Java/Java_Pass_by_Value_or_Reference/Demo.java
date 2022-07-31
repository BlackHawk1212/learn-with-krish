class Student{

    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(Course c) {
        this.course = c;
    }

    public Course getCourse() {
        return course;
    }

}

class Course{

    private String courseName;

    public Course(String courseName) {
        this.cname = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setName(String courseName) {
        this.cname = courseName;
    }

}

public class Demo {

    public static void main(String[] args){

        Student s = new Student("Nimesh");
        Course c = new Course("Java");

        s.setCourse(c);

        change(s);
        System.out.println(s.getCourse().getCourseName());

    }

    public static Student change(Student s1){
        Course c1 = new Course("Node");
        s1.setCourse(c1);
        return s1;
    }

}