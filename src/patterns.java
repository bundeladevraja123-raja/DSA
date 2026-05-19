public class patterns {
    static void main(String[] args) {
//pattern2(5);

        //pattern3(5);
        //pattern42nd(5);
       // pattern5(4);
        //pattern6();
       // pattern7();
        patternrepeate(4);
    }
    static void pattern(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = n; row >=1 ; row--) {
            for (int i = 0; i <row ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalcolsInrow=row>n?2*n-row:row;
            for (int col = 0; col < totalcolsInrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern42nd(int n){
        for (int row = 0; row < 2*n ; row++) {
            int colinrow=0;
            if(row>n){
                colinrow=2*n-row;
            }
            else{
                colinrow=row;
            }
            for (int col = 0; col <colinrow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row <2*n ; row++) {
            int colinrow=0;
            if(row>n){
                colinrow=2*n-row;
            }
            else{
                colinrow=row;
            }
            int spaces=n-colinrow;
            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=colinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(){
        for (int row = 1; row <= 4; row++) {

            for (int space = 0; space < 4 -row ; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col<=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern7(){
        for (int row = 0; row <2* 4; row++) {

            int colinrow=0;
            if(row> 4){
                colinrow=2* 4 -row;
            }
            else{
                colinrow=row;
            }
            for (int space = 0; space < 4 -colinrow; space++) {
                System.out.print("  ");
            }
            for (int col = colinrow; col >=1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <=colinrow ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    static void patternrepeate(int n){

        for (int row = 1; row <=n ; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
