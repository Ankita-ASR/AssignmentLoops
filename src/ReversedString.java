import java.util.Scanner;
public class ReversedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a string: ");
        String name = sc.nextLine();
        int length = name.length();
        for (int i = length-1; i >=0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
