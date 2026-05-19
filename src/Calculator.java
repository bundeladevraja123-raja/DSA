import java.util.*;
public class Calculator {
    static void main(String[] args) {

Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operator ");
        char op=sc.next().trim().charAt(0);
        if(op=='+'||op=='*'||op=='%'||op=='/'||op=='^'||op=='-'){

            System.out.println("Enter Two Numbers ");
          int num1=sc.nextInt();
          int num2=sc.nextInt();

          if(op=='+'){
              System.out.println("Answer :-"+(num1+num2));
          }

        }

    }
}
