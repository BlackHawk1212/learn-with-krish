public class SingleObject {

    //Create an Object of SingleObject
    private static volatile SingleObject singleObject; // = new SingleObject();

    private SingleObject(){

        //Reflection framework may interfere with this for create the second instance
        //Manually invoking in the constructor
        //We can stop that from here
        if(singleObject != null){
            throw new RuntimeException("Please use getSingleObject method");
        }
        //If someone interferes with reflection framework we block them in here
    }

    public static SingleObject getSingleObject(){
        //If the singleObject is null or not created
        //We set a singleObject in here

        //There is a principal called "Double-Checking Singleton" Implementation
        if(singleObject == null){
            //If it is null we call synchronize to SingleObject class
            synchronized (SingleObject.class){
                if(singleObject == null){
                    singleObject = new SingleObject();
                }
            }
        }
        //If it is created then it will return the singleObject
        return singleObject;
    }

}