//Brand Citozi SDA Academy
import java.io.*;
import java.util.HashSet;
public class SpecifiedSum {


        static void printpairs(int arr[], int sum)
        {
            HashSet<Integer> s = new HashSet<Integer>();
            for (int i = 0; i < arr.length; ++i) {
                int temp = sum - arr[i];

                // checking for condition
                if (s.contains(temp)) {
                    System.out.println(
                            "Pair with given sum "
                                    + sum + " is (" + arr[i]
                                    + ", " + temp + ")");
                }
                s.add(arr[i]);
            }
        }

        // Driver Code
        public static void main(String[] args)
        {
            int A[] = { 1, 2, 7, 3, 10, 2, 9 };
            int n = 4;
            printpairs(A, n);
        }
    }


