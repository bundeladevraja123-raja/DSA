import java.util.Arrays;

public class rotaterightfromk {
    static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=2;
        int n=arr.length-1;

        //rotate right from k
        for(int i=0;i<k;i++){
            int last=arr[n];
            for(int j=n;j>0;j--){

                arr[j]=arr[j-1];
            }
            arr[0]=last;

        }
        System.out.println(Arrays.toString(arr));
    }
}
