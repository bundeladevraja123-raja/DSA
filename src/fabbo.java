import java.util.Scanner;

public class fabbo {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number where you want fabbonacci series");
        int n= sc.nextInt();
        int fir=0;
        int sec=1;
        int i=0;
        while(n>i){
            System.out.println(fir);
            sec=fir+sec;
            fir=sec-fir;
            i++;
        }

            }
}



