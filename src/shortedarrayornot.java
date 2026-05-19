public class shortedarrayornot {

    static void main(String[] args) {
        int arr[]={1,2,4,3,5,6};
        boolean ans= shorted(arr);
        System.out.println(ans);
    }
      static boolean shorted(int arr[]) {


          for (int i = 0; i < arr.length-1; i++) {
              if (arr[i] > arr[i + 1]) {
                  return false;
              }
          }
          return true;
      }

}
