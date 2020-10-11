//Brand Citozi SDA Academy
import java.util.Scanner;

public class NumberOfEvenAndOdd {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,nr1=0,nr2=0;
        n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                nr1++;
            }
            else //if(arr[i]%2!=0)
            {
                nr2++;
            }
        }
        System.out.println("Even numbers are="+nr1);
        System.out.println("Odd numbers are="+nr2);
    }
}
