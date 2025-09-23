package module2.basicjava;

import java.util.Scanner;

public class MinAndMaxInArray 
{
	public static void main(String[] args) 
    {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create an array of size n
        int[] numbers = new int[n];
        
        // Ask the user to input the elements of the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Call the method to find the min and max
        findMin(numbers);
        findMax(numbers);
        
        // Close the scanner
        scanner.close();
    }

    // Method to find the minimum value in the array
    public static void findMin(int[] arr) 
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < min) 
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    // Method to find the maximum value in the array
    public static void findMax(int[] arr) 
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

