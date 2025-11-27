import java.io.*;

class myclass1
{
 
  public int a;

  public void method1()
  {
    a=100;
  }


}

class myclass2 extends myclass1
{

 public void method2()
  {
   a=200; //
  }

}

class stuff_code2
{

  public static void main(String []args)
   {

      myclass1 m1=new myclass1();
      m1.a=300; //

   }

}
