import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Event{
    int eventId;
    int regstudent;
    int capacity;

    Event(int eventId,int regstudent,int capacity){
     this.eventId=eventId;
     this.regstudent=regstudent;
     this.capacity=capacity;
    }

    void register(int count){
        if(count>0 && regstudent+count>=capacity){
            regstudent+=count;
        }
    }
    void cancel(int count){
        if(count>0 && regstudent-count>=0){
            regstudent-=count;
        }
    }



}

public class main {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int E=sc.nextInt();
        int N=sc.nextInt();
        HashMap<Integer,Event> map=new HashMap<>();
        for (int i = 0; i <E ; i++) {
           int id= sc.nextInt();
           int reg= sc.nextInt();
           int cap=sc.nextInt();


           map.put(id,new Event(id,reg,cap));
        }

        for (int i = 0; i <N ; i++) {
           String operation=sc.next();
           int id=sc.nextInt();
           int count=sc.nextInt();

           Event e=map.get(id);

           if(operation.equals("REGISTER")){
               e.register(count);
           } else if (operation.equals("CANCEL")) {
               e.register(count);
           }
        }

        ArrayList<Integer>ids=new ArrayList<>(map.keySet());
        Collections.sort(ids);

        for(int id:ids){
            Event e=map.get(id);
            System.out.println(e.eventId+" "+e.regstudent);

        }

        sc.close();

    }
}
