public class ceilingnuminarray {
    static void main(String[] args) {

        int arr[] = {2, 3, 4, 8, 12, 23, 34, 45, 56, 57};
        int start = 0;
        int target = 13;
        int end = arr.length - 1;
        if(target>arr.length){
            System.out.println("target length out of bound ");
        }

        while (start <=end) {
         int mid=(start+end)/2;
         if(arr[mid]==target){
             System.out.println(mid);
         }
         else if(arr[mid]<target){
             start=mid+1;
         }
         else{
             end=mid-1;
         }

        }
        System.out.println(arr[start]);

    }
}
