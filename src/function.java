import java.util.Scanner;

public class function {
    static void main(String[] args) {
//String result=greet();
//int ans=sum3(4,5);
//        System.out.println(ans);

        int a=10;
        int b=20;

        swap(a,b);
        System.out.println(a + " " +b);

    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    //when you dont want any return type


//    static void sum(){
//        int sum=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the first num ");
//        int num1=sc.nextInt();
//        System.out.println("enter second num");
//        int num2=sc.nextInt();
//        sum=num1+num2;
//        System.out.println(sum);
//
//    }

    //when you want any return type
//    static int sum(){
//        int sum=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the first num ");
//        int num1=sc.nextInt();
//        System.out.println("enter second num");
//        int num2=sc.nextInt();
//        sum=num1+num2;
//        return sum;
//    }

    //when you want string type of data
    static String greet(){
        String greeting="how are you ";
        return greeting;
    }
    //pass the value of number whewn you are calling the method in main()
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
}
