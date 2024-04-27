import java.util.Scanner; // importing the Scanner class to read user input

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating a new Scanner object to read from the console
        int[] arr = new int[4]; // declaring and initializing an array of integers with four elements

        System.out.println("Enter the values of the array elements: ");
        for (int i = 0; i < arr.length; i++) { // looping through each element in the array
            arr[i] = sc.nextInt(); // taking input from user and storing it in the array
        }

        int sum = 0; // initializing a variable to store the sum of the array elements
        for (int i = 0; i < arr.length; i++) { // looping through each element in the array
            sum += arr[i]; // adding the current element to the sum
        }

        double avg = (double) sum / arr.length; // calculating the average of the array elements
        System.out.println("The average of the array elements is: " + avg); // printing the average
    }
}