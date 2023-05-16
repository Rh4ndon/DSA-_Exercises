import java.util.Scanner;


public class ArraySumUserInput {
    public static void main(String[]args) {
    int[] arr = new int[5];
    Scanner input = new Scanner(System.in);

    System.out.println("Enter five integer values to fill the array:");

    // prompt the user to enter 5 integer values to fill the array
    for (int i = 0; i < arr.length; i++) {
        System.out.print("Enter value #" + (i+1) + ": ");
        arr[i] = input.nextInt();
    }

    int sum = 0; // initialize a variable to hold the sum of the array's values

    // use a for loop to iterate through each element of the array and add it ot the sum
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

    System.out.println("The sum of the array's value is: " + sum);
}
}