//Brand Citozi SDA Academy


import java.util.Scanner;

public class ReverseArray {

    /* Function to reverse arr[] from start to end*/
    static void rvereseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /* Utility function to print an array */
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

    }

    /* Driver function to test above functions */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Input what is the array's length");
        n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("What are the integers inside the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // To print original array
        System.out.print("The Original Array is: ");
        printArray(arr, n);

        // Function calling
        rvereseArray(arr, 0, n - 1);

        System.out.println("------------------------");

        // To print the Reversed array
        System.out.print("While Reversed array is: ");
        printArray(arr, n);

    }
}
