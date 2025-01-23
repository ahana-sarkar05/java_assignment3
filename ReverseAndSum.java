import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        double[] originalArray = new double[5];
        System.out.println("Enter 5 double values:");

     
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            originalArray[i] = scanner.nextDouble();
        }

       
        double[] reversedArray = new double[5];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

      
        double[] sumArray = new double[5];
        for (int i = 0; i < originalArray.length; i++) {
            sumArray[i] = originalArray[i] + reversedArray[i];
        }

       
        System.out.println("\nReversed array:");
        for (double value : reversedArray) {
            System.out.println(value);
        }

     
        System.out.println("\nSum of corresponding elements:");
        for (double sum : sumArray) {
            System.out.println(sum);
        }

        scanner.close();
    }
}