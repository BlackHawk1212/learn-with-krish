public class PalindromeDemo {

    public static void main(String[] a){

        PalindromeLinkedList pLinkedList1 = new PalindromeLinkedList();
        PalindromeLinkedList pLinkedList2 = new PalindromeLinkedList();
        
        //List 1
        pLinkedList1.addNode("A");
        pLinkedList1.addNode("B");
        pLinkedList1.addNode("C");
        pLinkedList1.addNode("D");
        pLinkedList1.addNode("B");
        pLinkedList1.addNode("A");
        
        //List 2
        pLinkedList2.addNode("R");
        pLinkedList2.addNode("A");
        pLinkedList2.addNode("C");
        pLinkedList2.addNode("E");
        pLinkedList2.addNode("C");
        pLinkedList2.addNode("A");
        pLinkedList2.addNode("R");

        System.out.println("Given LinkedList 1");
        pLinkedList1.isPalindrome();

        System.out.println("Given LinkedList 2");
        pLinkedList2.isPalindrome();
    }

}
