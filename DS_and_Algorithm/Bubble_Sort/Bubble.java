public class Bubble {
    static void print(int[] a) //function to print array elements
    {
        int n = a.length;
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void bubbleSort(int[] a)    // function to implement bubble sort
    {
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}