import java.util.Arrays;

public class seach2darraytrue {
    static void main(String[] args) {
        int arr[][]={{1,3,4},
                     {5,6,7},
                     {9,0,5,8}
        };
        int target=6;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
