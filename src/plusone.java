import java.util.Arrays;

public class plusone {
    public void main(String[] args) {
        int a=5;
        int[] arr = new int[a];
        int i=0;
        int n= arr.length-1;
        int last= n;
        int rem=0,div=0;
        arr[n]+=1;
        if(arr[n]>9){
            rem = arr[n]%10;
            div = arr[n]/10;

        }
        arr[n+1]=div;
        arr[n+2]=rem;


            System.out.println(Arrays.toString(arr));

    }
}
