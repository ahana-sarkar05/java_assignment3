import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of 5 integers
        int[] intArray = new int[5];
        System.out.println("Enter 5 integers:");

        // Read integers from user input
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            intArray[i] = scanner.nextInt();
        }

        // Create another array to store the string equivalents
        String[] stringArray = new String[intArray.length];

        // Convert each integer to a string and store in the second array
        for (int i = 0; i < intArray.length; i++) {
            stringArray[i] = String.valueOf(intArray[i]);
        }

        // Print the elements of the string array
        System.out.println("String array:");
        for (String s : stringArray) {
            System.out.println(s);
        }

        scanner.close();
    }
}