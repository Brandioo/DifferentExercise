//Brand Citozi
import java.util.Scanner;

public class ApperencesFrom0to10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int npt;
        npt = sc.nextInt();
        int[] arr = new int[npt];
        int i;
        int[] hist = new int[11];

        for (i = 0; i < npt; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < npt; i++) {
            hist[arr[i]]++;
        }
        for (i = 0; i < 11; i++) {
            System.out.println(i + " appears " + hist[i] + " times ");
        }

    }
}
