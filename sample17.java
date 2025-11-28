import java.io.*;
import java.util.*;

class sample1
{
  public static void main(String []args) throws IOException, InterruptedException{
     Thread.sleep(5000); // 5 seconds
     System.out.println(" hello ");
   File f=new File("sample123.txt");
   FileWriter fw=new FileWriter(f);
  }
}