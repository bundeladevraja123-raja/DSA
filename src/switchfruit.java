import java.util.Scanner;

public class switchfruit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fruit name  ");
        String fruit = sc.next();

        switch (fruit){
            case "mango"-> System.out.println("king of fruit ");
            case"apple"-> System.out.println("red and rounded");
            case"banana"-> System.out.println("big and large");
            default -> System.out.println("invailed fruit name ");
        }

    }
}
