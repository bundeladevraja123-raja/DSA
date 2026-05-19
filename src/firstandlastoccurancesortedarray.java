public class firstandlastoccurancesortedarray {
    static void main(String[] args) {
        int []arr={2,3,4,4,4,4,5,7,7};
        int target=7;
int first=firstoccurance(arr,target);
int last=lastoccurance(arr,target);
        System.out.println(first);
        System.out.println(last);

        }

       static int firstoccurance(int arr[],int target){

          int start=0;
          int end=arr.length-1;
          int ans=-1;

          while(start<=end){
              int mid=(start+end)/2;
              if(arr[mid]==target){
                  ans=mid;
                  end=mid-1;
              }
              else if(arr[mid]>target){
                  end=mid-1;
              }
              else {
                  start=mid+1;
              }
          }
          return ans;
    }

  static int lastoccurance(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
