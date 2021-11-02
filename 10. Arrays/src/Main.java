import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        //Use the {} to assign multiple elements in an array
//        int [] myArrays = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(myArrays[5]);

        //Add elements multiplied by 2 to an array using the for-loop
//        int[] forLoopArray = new int[10];
//        for (int i = 0; i < forLoopArray.length; i++) {
//            forLoopArray[i] = i*2;
//        }

        //Printing out the elements in the for-loop array
//        for (int i = 0; i < forLoopArray.length ; i++) {
//            System.out.println("Element " + i +" value is " + forLoopArray[i]);
//        }

        //Calling our user input method, store them in an array and loop to rint their value
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", type value was " + myIntegers[i]);
        }
            System.out.println("The average of your inputs is " + getAverage(myIntegers));
    }

    //First let's import the scanner util library
    private static Scanner scanner = new Scanner(System.in);

    //Getting user inputs and storing them in an array
    public static int[] getIntegers(int number) {
        System.out.println("please enter "+ number + " numbers.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    //Adding the arrays together and finding their average
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
