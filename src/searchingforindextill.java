import java.util.Arrays;

public class searchingforindextill {
    static void main(String[] args) {
        int arr[]={12,34,5,7,8,90,654,44,556,67,89,90};
        int target=654;
        int ans=search(arr,target,2,7);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }

    static int search(int arr[],int target,int start,int end){
        if(arr.length==0){
            return -1;

        }
        for (int i = start; i <=end ; i++) {
            if(arr[i]==target){
                
                return i;
            }

        }
        return -1;
    }
}
