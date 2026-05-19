import java.util.Scanner;

public class nestedswitch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acno = sc.nextInt();
        String holdername=sc.next();

        switch(acno)
        {
            case 1-> System.out.println("this is not your account");
            case 2-> System.out.println("this is shivas acoount");
            case 3->{
                System.out.println("account number is three");
                switch(holdername){
                    case "dev raja"-> System.out.println("your account is empty no money in your account ");
                    case "akhilesh"-> System.out.println("akhilesh has more money than you");
                    default -> System.out.println("ivailed holder name ");
                }

            }
            default -> System.out.println("account number is incorect ");
        }
    }
}

//import java.util.Scanner;
//
//public class nestedswitch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int acno = sc.nextInt();
//        sc.nextLine(); // fix
//
//        String holdername = sc.nextLine();
//
//        switch(acno)
//        {
//            case 1 -> System.out.println("this is not your account");
//            case 2 -> System.out.println("this is shivas account");
//
//            case 3 -> {
//                System.out.println("account number is three");
//
//                switch(holdername){
//                    case "dev raja" -> System.out.println("your account is empty no money in your account");
//                    case "akhilesh" -> System.out.println("akhilesh has more money than you");
//                    default -> System.out.println("invalid holder name");
//                }
//            }
//
//            default -> System.out.println("account number is incorrect");
//        }
//    }
//}
