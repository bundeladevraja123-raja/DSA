public class floornuminaray {
    static void main(String[] args) {
        int arr[]={2,3,4,5,6,12,23,34,45,56,67,78};
        int start=0;
        int target=24;
        int end=arr.length-1;
        if(target> arr.length-1){
            System.out.println("target range out of bound");
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }
            else if (arr[mid]>target){
              end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        System.out.println(arr[end]);

    }
}
