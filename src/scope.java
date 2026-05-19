public class scope {
    static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a);

        {

            a=78;
            int c=99;
            System.out.println(c);
        }

      }
    static void random(){
        int num=90;
        System.out.println(num);
        //when you intialize the variable in any function
        //then access the variable particular that fun
    }
}
