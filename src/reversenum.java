import java.util.*;
    class reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");

        int n=sc.nextInt();
        int rem=0;
        int ans=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
