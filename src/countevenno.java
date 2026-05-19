public class countevenno {
    static void main(String[] args) {
        int arr[]={34,455,56,677,78,76543,34,45,};
        int ans=even(arr);
        System.out.println(ans);
    }
    static int even(int arr[]){
        int count=0;
        for(int num:arr){
            if(digit(num)){
                count++;
            }
        }
        return count;
    }
    static boolean digit(int no){
        int digitcount=count(no);
        return digitcount%2==0;

    }
    static int count(int no){
        int count=0;
        while(no>0){
            count++;
            no/=10;
        }
        return count;
    }
}
