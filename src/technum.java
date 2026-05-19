import java.util.*;
public class technum {
    static void main(String[] args) {
        int r=0;
        int count=0,ten=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int ori=n;

        if(n==0){
            System.out.println("invailed number please enter right");
        }
        while(n>0){
           n= n/10;
            count++;
        }
        System.out.println("your number count is " + count+ "");
        if(count%2!=0){
            System.out.println("invailed number hai ");
        }
        count/=2;

        System.out.println("number half count is " + count + "");

        while(count>0){
            ten=ten*10;
            count--;
        }
        System.out.println("the value of dividing the number " + ten+  " ");
        n=ori;
        int rem=n%ten;
        System.out.println("piche wala "+rem);
        int rev=n/ten;
        System.out.println("aage bala "+rev);
        int sum=rem+rev;
        System.out.println("both sum "+sum);
        int sq=sum*sum;
        System.out.println("square of the sum "+sq);


        if(sq==ori){
            System.out.println("tech number " +sq+"=="+ori);
        }
        else
            System.out.println("non tech number ");
    }

}
