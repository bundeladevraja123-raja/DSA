public class armstrongnum {
    static void main(String[] args) {
int n=153;
int ori=n;
int count=0;

int sum=0;
int rem;
while(n>0){
    n/=10;
    count++;

}
n=ori;
while(n>0){
    int pwr=1;
    rem=n%10;

    for(int i=0;i<count;i++){
        pwr=pwr*rem;
    }
    sum=sum+pwr;
    n=n/10;
}
n=ori;
if(sum==n){
    System.out.println("yes");

}
else{
    System.out.println("no");
}

    }
}
