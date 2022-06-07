public class MementoDemo {
    public static void main(String[] args){

        CareTaker caretaker = new CareTaker();
        Originator originator = new Originator();

        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento( originator.save() );
        originator.setState("State3");
        caretaker.addMemento( originator.save() );
        originator.setState("State4");
        originator.restore( caretaker.getMemento() );
    }
}