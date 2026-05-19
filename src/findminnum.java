public class findminnum {
    static void main(String[] args) {
        int arr[]={34,45,56,67,32,21,11};
        int min=arr[0];
      findmin(arr,min);
//        System.out.println(ans);
    }
    static int findmin(int[] arr, int min){
        int temp=0;
        if(arr.length==0){
          return -1;
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                 temp=arr[i];
               arr[i]=temp;
                min=temp;
            }
        }
        System.out.println(min);

        return min;
    }
}
