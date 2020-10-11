//Brand Citozi SDA Academy

import java.util.Scanner;

public class ArithmeticSeries {

    public static int Nth_of_AP(int a,
                                int d,
                                int N) {
        // using formula to find the Nth
        // term t(n) = a(1) + (n-1)*d
        return (a + (N - 1) * d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int N = sc.nextInt();
        System.out.print("The " + N +
                "th term of the series is : " + Nth_of_AP(a, b, N));
    }

    /*
Input: 2 1 5
Output: The 5th term of the series is : 6
     */
}

