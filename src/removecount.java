import java.util.Scanner;

public class removecount {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int j = 0;

        System.out.println("enter the " + n + " numbers ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of which you want to remove");
        int val = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[j] = arr[i];
                j++;
            }
        }
        System.out.println("new array is ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        System.out.println(j);

    }
}
