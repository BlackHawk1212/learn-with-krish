public class ReverseLinkedList {

    private Node head = null;
    private Node tail = null;

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
    }

    //Display all the nodes
    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //Reverse from end node to the first node
    public void reverseList(){
        if(tail != null && head != null){
            Node current = head;
            Node previousNode = tail, nextNode = null;

            while(current != previousNode){
                previousNode.next = current;
                head = current.next;
                tail = current;
                current.next = null;
                if (nextNode != null) {
                    tail.next = nextNode;
                }
                current = head;
                nextNode = previousNode.next;
            }
        }
    }

}
