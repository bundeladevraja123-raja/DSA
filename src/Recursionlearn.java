public class Recursionlearn {
    static void main(String[] args) {
        massage();
    }
    static void massage(){
        System.out.println("Hello world ");
        massage1();

    }
    static void massage1(){
        System.out.println("Hello world ");
        massage2();
    }
    static void massage2(){
        System.out.println("Hello world ");
        massage3();
    }
    static void massage3(){
        System.out.println("Hello world ");
        massage4();
    }
    static void massage4(){
        System.out.println("Hello world ");
    }
}
