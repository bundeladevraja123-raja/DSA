public class overloading {
    static void main(String[] args) {
fun(10);
fun("dev raja");

    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}

// when compile time decide whose funtion run first
// fun overloading  name is same with diffrent parameter

