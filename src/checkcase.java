import java.util.Scanner;

public class checkcase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        }
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("upper case");
        }

    }
}
