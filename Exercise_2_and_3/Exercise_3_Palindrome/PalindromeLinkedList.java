import java.util.Objects;

public class PalindromeLinkedList {

    private int size;   //Size of the list
    private Node head = null;   //First Node
    private Node tail = null;   //Last Node

    //Adding a node to the list
    public void addNode(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    //Reverse from end node to the first node
    public Node reverseList(Node temp){
        Node current = temp;
        Node previousNode = null, nextNode = null;

        while(current != null){
            nextNode = current.next;
            current.next = previousNode;
            previousNode = current;
            current = nextNode;
        }
        return previousNode;
    }

    //Check whether the given list Palindrome or not
    public void isPalindrome(){
        Node current = head;
        boolean flag = true;
        int mid = 0;

        if(size % 2 == 0){
            mid = size / 2;
        } else {
            mid = (size + 1) / 2;
        }

        for(int i = 1; i < mid; i++){
            current = current.next;
        }

        Node reverseHead = reverseList(current.next);

        while(head != null && reverseHead != null){
            if(!Objects.equals(head.data, reverseHead.data)){
                flag = false;
                break;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }

        if(flag)
            System.out.println("is a Palindrome");
        else
            System.out.println("is not a Palindrome");
    }

    //Display all the nodes
    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        System.out.println("Nodes of linkedList: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
