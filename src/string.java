import java.util.Arrays;

public class string {
    static void main(String[] args) {
        String a="dev";
        String b="dev";

        System.out.println(a==b);

        String name1=new String("devraja");
        String name2=new String("devraja");
        System.out.println(name1==name2); //it giving false beacuase it not seeing values

        System.out.println(new int []{1,2,3,4,5,});
        System.out.println(Arrays.toString( new int[]{1,2,3,4,5}));
    }
}
