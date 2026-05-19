import java.util.Arrays;

public class rotatefromk {
    static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=2;
   for(int i=0;i<k;i++){
       int first=arr[0];
       for(int j=0;j<arr.length-1;j++){
           arr[j]=arr[j+1];
       }
       arr[arr.length-1]=first;
   }
        System.out.println(Arrays.toString(arr));
    }

}
