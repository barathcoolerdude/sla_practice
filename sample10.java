import java.util.*;
    class student{
        public String name;
        public int rollno;
        public float marks;

        public void getdetails(){
            Scanner s=new Scanner(System.in);
            System.out.println("enter the name, roll number and marks");

            name = s.next();
            rollno = s.nextInt();
            marks=s.nextFloat();
        }
        
        public void displaydetails(){
            System.out.println(" name: "+ name +" rollno "+ rollno + " marks "+marks);
        }
    }

public class sample10{
    public static void main(String[]args){
        student student1=new student();
        student student2=new student();

        student1.getdetails();
        student2.getdetails();

        student1.displaydetails();
        student2.displaydetails();

    }


}

