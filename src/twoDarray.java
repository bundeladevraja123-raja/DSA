import java.util.Arrays;
import java.util.Scanner;

public class twoDarray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of the array");
        int rows= sc.nextInt();
        int col=sc.nextInt();

        //taking array length input from the user

        int arr[][]=new int[rows][col];

        //taking the input row and col element from the user

        System.out.println("enter the elements");

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
//        for(int i=0;i<rows;i++){
//        for(int j=0;j<col;j++) {
//            System.out.print(arr[i][j] +" ");
//        }
//            System.out.println();
//        }


        //  with the help of each loop
        for(int []a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
