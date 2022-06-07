import java.util.ArrayList;

public class CareTaker {
    private final ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento() {
        return mementos.get(1);
    }
}