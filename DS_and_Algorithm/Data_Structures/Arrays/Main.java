public class Main {
    public static void main(String[] args) {
        ArrayStructures newArray = new ArrayStructures();

        newArray.printRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueIndex(3));
        System.out.println(newArray.valueSearch(20));
        newArray.deleteIndex(7);
        newArray.printArray();
        newArray.insertValue(10);
        newArray.printArray();
        newArray.linearSearch(16);

    }
}