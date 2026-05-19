public class passbyvalue {
    static void change(int x){
        x=10;
    }

    static void main(String[] args) {
        int a=100;
        change(a);
        System.out.println(a);
    }
}
//output will be 100 because x copy insert in the change
//function and replace by the a
