public class Main {
    public static void main(String[] args) {
        
        int[] a = {35, 10, 31, 11, 26};
        Bubble b1 = new Bubble();
        System.out.println("Before sorting array elements are - ");
        b1.print(a);
        b1.bubbleSort(a);
        System.out.println();
        System.out.println("After sorting array elements are - ");
        b1.print(a);

    }
}