public class SingletonPatternDemo {
    public static void main(String[] args){

        //First Instance
        SingleObject singleObject1 = SingleObject.getSingleObject();
        System.out.println(singleObject1);

        //Second Instance
        SingleObject singleObject2 = SingleObject.getSingleObject();
        System.out.println(singleObject2);

    }
}