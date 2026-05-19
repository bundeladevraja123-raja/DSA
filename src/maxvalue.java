public class maxvalue {
    static void main(String[] args) {
        int arr[]={2,16,3,45,67,12,23,88};
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

}
