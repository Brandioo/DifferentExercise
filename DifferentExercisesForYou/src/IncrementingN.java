//Brand Citozi SDA Academy
import java.util.Scanner;

public class IncrementingN {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int sum;
        int i=1;
        n=sc.nextInt();
        do{
            sum=i*n;
            i++;
            System.out.print(sum+" ");
        }while (i<=n);
    }
}
