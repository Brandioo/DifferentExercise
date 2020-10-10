//Brand Citozi SDA Academy
import java.util.Scanner;

public class PrintLoop {
    public static void printNumber(int number)
    {
        int previousNumber=number;
        System.out.print(number+" ");
        for(int i=1;i<number;i++)
        { int current= (int) (number*Math.pow(10,i)+previousNumber);
            System.out.print(current+" ");
            previousNumber=current;


        }
    }
    public static void main(String[] args) {
        printNumber(5);
    }
}
