import java.util.Scanner;

public class nthfabbo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth number ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if (n == 1) {
            System.out.println(a);
        }
        if (n == 2) {
            System.out.println(b);
        }
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(n + " fabbonacci num is " + c);
    }
}
