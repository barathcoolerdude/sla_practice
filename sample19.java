import java.io.*;

class Table{
    public synchronized void accessTheNote(String msg){
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(msg);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class student1 extends Thread{
    public Table t1;
    public void run(){
        t1.accessTheNote("reading");
    }
}
class student2 extends Thread{
    public Table t2;
    public void run(){
        t2.accessTheNote("wrting...");
    }
}

class sample19{
    public static void main(String[]args){
        student1 s1=new student1();
        student2 s2=new student2();

        Table t=new Table();
        s1.t1=t;
        s2.t2=t;

        s1.start();
        s2.start();
    }
}