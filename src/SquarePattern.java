import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        int row,cl,n;
       Scanner sc = new Scanner(System.in);
       n= sc.nextInt();
        for(row=1; row<=n; row++)
        {
            for(cl=1; cl<= (2*n+1); cl++)
            {
                if(cl==(n+1))
                    System.out.print(" ");
                else if(cl>=1 && cl <=n)
                    System.out.print("*");
                else if(cl==2*n+1 || cl ==(n+2)|| row==1 || row==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
