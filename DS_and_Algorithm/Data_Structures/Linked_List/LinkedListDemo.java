public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);

        list.show();
        System.out.println("--------------------");

        list.insertAtStart(25);
        list.show();
        System.out.println("--------------------");

        list.insertAt(2, 50);
        list.show();
        System.out.println("--------------------");

        list.insertAt(0, 50);
        list.show();
        System.out.println("--------------------");

        list.deleteAt(5);
        list.show();
        System.out.println("--------------------");

    }
}