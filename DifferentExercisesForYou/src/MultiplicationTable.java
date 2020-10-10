//Brand Citozi SDA Academy
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr;
        int result;
        System.out.println("-----Multiplication table for one number till 10-----");
        System.out.println("Input the number:");
        nr = sc.nextInt();
        System.out.println("Multiplication result for each number till 10:");
        for (int i = 1; i <= 10; i++) {
            result = nr * i;
            System.out.print(result+" ");
        }
    }

}

