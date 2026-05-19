import java.util.Scanner;

public class linearsearch {

    static void main(String[] args) {
        int arr[]={2,3,5,6,7,13,35,46,67};
        int target=3;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
