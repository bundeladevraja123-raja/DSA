import java.util.Arrays;

public class insertionsort {
    static void main(String[] args) {
int arr[]={5,3,4,1,2};
insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
           if(arr[j]<arr[j-1]){
               swap(arr,j,j-1);
           }
           else{
               break;
           }
            }
        }
    }
    static void swap(int []arr,int fir,int sec){
        int temp=arr[fir];
        arr[fir]=arr[sec];
        arr[sec]=temp;
    }
}