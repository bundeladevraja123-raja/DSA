import java.util.Arrays;
import java.util.Scanner;

public class searchin2darray {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of the array");
        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                arr[i][j]= sc.nextInt();

            }
        }
        for(int []a:arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("enter the target");
        int target=sc.nextInt();
        int[] ans=search(arr,target);
        System.out.println(ans);
    }
    static int[] search(int[][] arr, int target){
        if(arr.length==0){
            return new int[]{-1};
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]){
return new int[]{i,j};
                }

            }
        }

        return new int[]{-1,-1};
    }
}
