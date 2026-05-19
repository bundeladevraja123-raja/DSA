public class lengthoflastword {

   public static int main(String[] args) {
       String s="i am very good ";
       String s1[]=s.split(" ");
       String s2= s1[s1.length-1];
       int length=s2.length();
       return length;
   }
}
