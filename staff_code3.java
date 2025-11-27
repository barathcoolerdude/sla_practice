import java.util.*;

abstract class A{
    abstract void wrote();

    public void display(){
        System.out.println("display");
    }

}

class B extends A{
    public void wrote(){
        System.out.println("wrote here");
    }
}

class staff_code3{
    public static void main(String[]args){
        A b=new B();
        b.display();
    }
}