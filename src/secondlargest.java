public class secondlargest {
    static void main(String[] args) {
        int arr[] = {10,10,10,10};
        int max=arr[0];
        int smax=0;
        boolean found=false;

        for(int i=1;i<arr.length;i++) {
            if (arr[i] > max) {

                smax = max;
                max = arr[i];
                found = true;
            }
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
                found = true;
            }
        }
            if(!found){
                System.out.println("no second largest");
            }
            else{
                System.out.println(smax);
            }



    }
}
