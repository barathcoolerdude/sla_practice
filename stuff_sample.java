import java.io.*;
import java.util.*;

class student
{

 public int rollno;
 public String name;
 public float mark;

 public void getdetails()
 {
  System.out.println("enter rollno, name, mark");
  Scanner s=new Scanner(System.in);

  rollno=s.nextInt();
  name=s.next();
  mark=s.nextFloat();


  }

  public void displaydetails()
  {
    System.out.println(" ROLL NO " + rollno +" NAME "+ name+" MARK " +mark );
  }


}

class stuff_sample
{

 public static void main(String []args)
  {
     student s1=new student(); // s1=1000={rollno=1, name=aaa, mark=98.6, getdetails(), displaydetails()}
     student s2=new student(); // s2=2000={rollno=2, name=bbb, mark=87.5, getdetails(), displaydetails()}

     s1.getdetails();
     s2.getdetails();

     s1.displaydetails();
     s2.displaydetails();

  }

}