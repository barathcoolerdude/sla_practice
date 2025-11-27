abstract class ab{
    abstract void abstractMethod();
}
class A extends ab{
    public int a = 5;

    public void display(){
        System.out.println("display1");
    }
    public void display(String a){
        System.out.println("string: "+a);
    }

    public void abstractMethod(){
        System.out.println("abstract method implimentation");
    }
}
class B extends A{
    public void displayInhertance(){
        System.out.println("a from B: "+a);
    }

    public void display(){
        System.out.println("display2");
    }
}

class C extends B{
    public void displayInhertance(){
        System.out.println("a from C: "+a);
    }
    public void display(){
        System.out.println("display3");
    }
}

class sample14{
    public static void main(String[]args){
        A obj=new A();
        B obj2=new B();
        C obj3=new C();

        // virtual method overloading
        obj.display();
        obj2.display();
        obj3.display();

        // multiple level inheritance
        obj2.displayInhertance();
        obj3.displayInhertance();

        // method overloading
        obj.display();
        obj.display("something");

        // writing abstract method
        obj.abstractMethod();
    }
}