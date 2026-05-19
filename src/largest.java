import java.util.*;

public class largest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num");
        int num1 = sc.nextInt();
        int max = num1;
        System.out.println("enter second num");
        int num2 = sc.nextInt();
        System.out.println("enter third num");
        int num3 = sc.nextInt();
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("max number is " + max);
    }
}
