import java.util.Scanner;
public class DiamondPattern {
    public static void main(String [] args) {
        int row, cl, sp;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sp = n - 1;
        int k = 1;
        for (row = 1; row <= 2*n-1; row++)//for line
        {
            for (int j = 1; j <= sp; j++) //for space
            {
                System.out.printf(" ");

            }
            for (cl = 1; cl <= k; cl++) {
                System.out.printf("*");

            }
            if(row<n)
            {
                sp--;
                k=k+2;
                System.out.println();
            }
            else
            {
                sp++;
                k=k-2;
                System.out.printf("\n");
            }
        }
    }
}
