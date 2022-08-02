import java.util.Date;
import java.util.function.*;

public class FunctionalInterfaceEx {
    public static void main(String[] args) {

        //SUPPLIER - does not take input, return output
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());

        //CONSUMER - accept one input and return no output
        Consumer<String> consumer = (String str) -> System.out.println(str);
        consumer.accept("Virtusa");

        Consumer<String> consumer1 = System.out::println;
        consumer.accept("Virtusa");

        //PREDICATE - takes input and return boolean
        Predicate<Integer> predicate = (i) -> i > 10;
        System.out.println(predicate.test(5));

        //FUNCTION - takes and input and converts it to some other output
        Function<String,Integer> function = (String s) -> Integer.parseInt(s);
        System.out.println(function.apply("10") + 20);


        BiFunction<String,String,Integer> biFunction = (s1,s2) -> Integer.parseInt(s1+s2);
        System.out.println(biFunction.apply("10","20") + 80);
    }
}
