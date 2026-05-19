import java.util.Scanner;

public class primenum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n = sc.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
