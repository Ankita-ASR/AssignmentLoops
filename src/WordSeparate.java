import java.util.Scanner;
public class WordSeparate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a string: ");
        String name = sc.nextLine();
        int length = name.length();
        for (int i = 0; i < length; i++) {
            System.out.println(name.charAt(i));
        }
    }
}
