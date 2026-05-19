public class RBS {
    static void main(String[] args) {

    }

    static int search(int[] nums, int target) {
        int pivot=findpivot(nums);
      if(pivot==-1){
       return binarysearch(nums,target,0,nums.length-1);
      }
   if(nums[pivot]==target){
       return pivot;
   }
   else if(target>=nums[0]){
       return binarysearch(nums,target,0,pivot-1);         //all of the element are greater than pivot
   }
   else{
       return binarysearch(nums,target,pivot,nums.length-1);    //all of the element are smaller than pivot
   }

    }

    static int binarysearch(int arr[],int target,int start,int end){


        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int findpivot(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid<end  && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
               end=mid-1;

            }
           else{
               start=mid+1;
            }
        }
        return -1;
    }
}
