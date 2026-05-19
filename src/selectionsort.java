import java.util.Arrays;

public class selectionsort {
    static void main(String[] args) {
        int arr[]={23,11,2,3,45,56,6};
         selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int arr[]){
        for(int i=0;i< arr.length;i++){
            int last= arr.length-i-1;
            int max=getmax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int []arr,int fir,int sec){
        int temp=arr[fir];
        arr[fir]=arr[sec];
        arr[sec]=temp;
    }

    static int getmax(int []arr,int start,int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}