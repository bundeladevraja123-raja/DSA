public class leftrotatearrayby1 {
    static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=first;

        for (int k = 0; k <arr.length ; k++) {
            System.out.print(arr[k]);
        }
    }
    }

