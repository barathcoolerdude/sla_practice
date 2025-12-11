import java.io.*;
import java.sql.*;

class sample20
{

  public static void main(String []args)
  {
  
  try
  {

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/company_db", "root", "harrypotter");

     String query="select * from departments;"  ;

     Statement stmt=conn.createStatement();

     ResultSet rs=stmt.executeQuery(query);
    
     System.out.printf("%-10s %-20s %-20s% %-30s%n",
                "dept-id", "dept_name", "location", "budget"
            );


   
   conn.close(); 



  }
  catch( ClassNotFoundException ex )
  {
    System.out.println(ex.getMessage() );
  }
  catch(SQLException ex)
  {
    System.out.println(ex.getMessage() );
  }





  }

}

