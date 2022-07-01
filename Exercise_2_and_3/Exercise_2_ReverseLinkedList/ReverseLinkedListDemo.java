public class ReverseLinkedListDemo {

    public static void main(String[] a){

        ReverseLinkedList rLinkedList1 = new ReverseLinkedList();
        ReverseLinkedList rLinkedList2 = new ReverseLinkedList();

        //List 1
        rLinkedList1.addNode("A");
        rLinkedList1.addNode("B");
        rLinkedList1.addNode("C");
        rLinkedList1.addNode("D");
        rLinkedList1.addNode("E");
        rLinkedList1.addNode("F");

        //List 2
        rLinkedList2.addNode("L");
        rLinkedList2.addNode("M");
        rLinkedList2.addNode("N");
        rLinkedList2.addNode("O");
        rLinkedList2.addNode("P");
        rLinkedList2.addNode("Q");
        rLinkedList2.addNode("R");

        //Printing List 1
        System.out.println("Before Reverse the LinkedList");
        rLinkedList1.display();
        rLinkedList1.reverseList();
        System.out.println("After Reverse the LinkedList");
        rLinkedList1.display();

        System.out.println();
        System.out.println("###############################");
        System.out.println();

        //Printing List 2
        System.out.println("Before Reverse the LinkedList");
        rLinkedList2.display();
        rLinkedList2.reverseList();
        System.out.println("After Reverse the LinkedList");
        rLinkedList2.display();

    }

}
