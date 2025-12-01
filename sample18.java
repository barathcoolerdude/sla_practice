import java.util.*;
class class1 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("method1: "+i);
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("class1 goes boom");
        }
    }
    
}
class class2 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("method2: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("class2 goes boom");
        }
    }
    
}

class sample18{
    public static void main(String []args){
        class1 myclass1=new class1();
        class2 myclass2=new class2();

        myclass1.start();
        myclass2.start();
    }
}

