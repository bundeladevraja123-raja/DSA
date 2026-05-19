import java.util.Arrays;

public class charsrcinstring {
    static void main(String[] args) {
        String name = "devrajabundela";
        char target = 'b';
        System.out.println(search2(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search(String str,char target) {
      if(str.length()==0) {    //str.length is a method to determine the how many values are stored in the string
          return false;
      }

        for (int i = 0; i <str.length() ; i++) {
            if(target==str.charAt(i)){  //for finding the value of in the string

                return true;

            }
        }
        return false;

    }

    static boolean search2(String str,char target) {
        if(str.length()==0) {    //str.length is a method to determine the how many values are stored in the string
            return false;
        }

       for(char ch:str.toCharArray()){  //str.tochararray convert string into array format
           if(ch==target){
               return true;

           }
       }
        return false;

    }
}
