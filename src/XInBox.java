import java.util.Scanner;
public class XInBox {
    public static void main(String [] args) {
        int row,cl;
   Scanner scanner= new Scanner(System. in);
   int n= scanner.nextInt();
        for(row=1; row<=n; row++)
        {
            for(cl=1; cl<=n; cl++)
            {
                if(row==cl || row+cl==(n+1)||row==1 || row==n || cl==1 || cl==n )
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
