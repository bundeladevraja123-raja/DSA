public class Armstrong {
    static void main(String[] args) {
        int n=1634;
        int ori=n;
        int count=0;


        int rem;
        int sum=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        n=ori;

        while(n>0){
            int pwr=1;
            rem=n%10;
            n=n/10;
            for(int i=0;i<count;i++){
                pwr=pwr*rem;
            }
            //System.out.println(pwr);
            sum=sum+pwr;

        }
        System.out.println(sum);
        n=ori;

        if(n==sum){
            System.out.println("Armstrong num");

        }
        else{
            System.out.println("Not armstrong");
        }

    }
}






