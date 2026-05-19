public class passbyreference {
    static void change(int arr[]){
        arr[0]=100;
    }

    static void main(String[] args) {
        int arr[]={10};
        change(arr);
        System.out.println(arr[0]);
    }
}

static void swap(int arr1[]){
    arr1[0]=99;

}

void main(String[] args) {
    int arr[]={1,2,3,5,6,};
    swap(arr);
    System.out.println(Arrays.toString(arr));
}
