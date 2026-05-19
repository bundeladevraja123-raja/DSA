import java.util.Arrays;

public class removeduplicates {
    static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5,5};
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int k=0;k<j;k++){
            System.out.println(arr[k]);
        }
    }
}
