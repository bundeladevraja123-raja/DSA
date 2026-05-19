import java.util.Arrays;

public class binarysearch {
    static void main(String[] args) {
    int arr[]={3,4,5,6,7,8,9,11,23,44};
    int start=0;
    int target=7;
    int end=arr.length-1;
    while(start<=end) {
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            System.out.println(mid);
            return;

        } else if (arr[mid] > target) {
            end = mid - 1;
        } else  {
            start = mid + 1;
        }
            System.out.println("Result not found in the array");

    }
    }
}




