import java.util.Scanner;

public class numoccurence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();

        int rem = 0;
        int count = 0;
        System.out.println("enter the num which you want to count");
        int c = sc.nextInt();
        while (n > 0) {
            rem = n % 10;

            if (rem == c) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

    }
}
