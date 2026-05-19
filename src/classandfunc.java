public class classandfunc {
    static void main(String[] args) {
        student s1=new student();
     student2 s2=new student2();
     car c=new car("TOYOTA",2003);
    // c.display();
     fortuner f=new fortuner();
     fortuner f1=new fortuner("BLUE",300);
     fortuner f2=new fortuner("black");

  //   s1.name="Dev";
    // s1.age=18;
   //  s1.display();
     //   s2.display();
        f1.display();
        f2.display();



    }
}

class student{
    String name ;
    int age;

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}


class student2{
    String name;
    int age;

    // constructor
    student2(){
        name="Raja";
        age=99;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }

}

// this keyword learning

class car{
    String brand;
    int year;

    car(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    void display(){
        System.out.println(brand);
        System.out.println(year);
    }
}

// concept of overloading

class fortuner{

    String color;
    int rpm;

    fortuner(){
        System.out.println("Default constructor ");
    }
    fortuner(String color,int rpm){
        this.color=color;
        this.rpm=rpm;
    }
    fortuner(String color){
        this.color=color;


    }
    void display(){
        System.out.println(color);
        System.out.println(rpm);
    }

        }

