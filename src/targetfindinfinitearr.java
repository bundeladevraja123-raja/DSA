public class targetfindinfinitearr {
    static void main(String[] args) {
int arr[]={1,2,3,4,5,6,7,8,9,10,12,14,15,18,99};
int target=10;
        System.out.println(ans(arr,target));

    }
    static int ans(int []arr,int target){
        int start=0;
        int end=1;

        while(target>end){
            int temp=end+1;

            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(arr,target,start,end);
    }

    static int binarysearch(int arr[],int target,int start,int end) {



        int ans=0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <target) {
                start=mid+1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else
           return mid;

        }
        return -1;
    }

}
