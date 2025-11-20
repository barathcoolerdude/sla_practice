import java.util.*;
class mother{
    public int a, b ,c;

    public mother(){
        a = 100;
        b=200;
    }
    public void add(){
       System.out.println("a: "+a+" b: "+b+" c: "+c) ;
    }
}
class child extends mother{
    public void subtract(){
        c = a -b;
        System.out.println("c: "+c);
    }
}

class sample14{
    public static void main(String[]args){
        child children=new child();
        children.subtract();
        children.add();
    }
}