public class ArrayStructures {

    private final int[] intArray = new int[50];
    private int arraySize = 10;

    //Printing a Random Array
    public void printRandomArray() {
        for(int i = 0; i < arraySize; i++) {
            intArray[i] = (int)(Math.random() * 10) + 10;
        }
    }

    //Get the Value at a Particular Index
    public int getValueIndex(int index) {
        if (index < arraySize)return intArray[index];

        return 0;
    }

    //Print the Array
    public void printArray() {
        System.out.println("-------------");
        for(int i = 0; i < arraySize; i++) {
            System.out.print("Index" + "["+ i + "]");
            System.out.println(" " + intArray[i]);
            System.out.println("------------");

        }
    }

    //Search the Value in an Array
    public boolean valueSearch(int searchValue) {
        boolean valueInArray = false;

        for(int i = 0; i < arraySize; i++) {
            if (intArray[i] == searchValue) {
                valueInArray = true;
                break;
            }
        }
        return valueInArray;
    }

    //Delete an Index
    public void deleteIndex(int index) {
        if(index < arraySize) {
            if (arraySize - 1 - index >= 0)
                System.arraycopy(intArray, index + 1, intArray, index, arraySize - 1 - index);
            arraySize--;
        }
    }

    //Insert an Value
    public void insertValue(int value) {
        if(arraySize < 50) {
            intArray[arraySize] = value;
            arraySize++;
        }
    }

    //Linear Search for a Value
    public void linearSearch(int value) {
        boolean valueInArray = false;
        String indexWithValue = "";

        System.out.print("The Value was Found in the Following: ");
        for(int i = 0; i < arraySize; i++) {
            if(intArray[i] == value) {
                valueInArray = true;
                System.out.print(i + " ");
                indexWithValue = i + "";
            }
        }
        if(!valueInArray) {
            indexWithValue = "None";
            System.out.println(indexWithValue);
        }
        System.out.println();
    }

}