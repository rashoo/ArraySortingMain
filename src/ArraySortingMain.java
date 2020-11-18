import java.util.Scanner;

public class ArraySortingMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] getIntegers = getIntegers(5);
        int[] sorted = sortIntegers(getIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int arrayCapacity){
        int[] arrayValues = new int[arrayCapacity];
        System.out.println("Enter " + arrayCapacity + " integer values:\r");

        for(int i=0; i<arrayValues.length; i++){
            arrayValues[i] = scanner.nextInt();
        }return arrayValues;
    }

    public static void printArray(int[] arrayValues){
        for(int i=0; i<arrayValues.length; i++){
            System.out.println("The values were at: "+i+ " were: " + arrayValues[i]);
        }
    }

    public static int[] sortIntegers(int[] arrayValues){
        int[] sortedArray = new int[arrayValues.length];//Same length, empty array
        for(int i=0; i<arrayValues.length; i++){
            sortedArray[i] = arrayValues[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
