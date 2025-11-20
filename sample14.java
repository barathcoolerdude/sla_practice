import java.util.*;
class Dosome{
    private int a,b;

    public Dosome(){
        a = 100;
        b = 200;
    }
    public Dosome(int x,int y){
        a = x;
        b = y;
    }

    public void display(){
        System.out.println("a: "+a+" b: "+b+" c: "+(a+b));
    }
}
public class sample14{
    public static void main(String[]args){
        Dosome dosome1=new Dosome();
        Dosome dosome2=new Dosome(200, 200);
        dosome1.display();
        dosome2.display();
        


    }
}