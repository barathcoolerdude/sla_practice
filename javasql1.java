import java.sql.*;
import java.util.*;

class myCommands{
    public void addRecord(Scanner s){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mypassword");

            System.out.print("enter name: age: active(true/false): ");
            String name=s.next();
            int age=s.nextInt();
            boolean active=s.nextBoolean();
            
            String query="insert into users(name, age, active) values(?,?,?);";

            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setBoolean(3, active);

            int rows= ps.executeUpdate();
            System.out.print("inserted "+rows+" rows");

            String query2="select * from users;";

            Statement stmt2=conn.createStatement();
            ResultSet rs2=stmt2.executeQuery(query2);

            while(rs2.next()){
                System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getInt(3)+" "+rs2.getBoolean(4));
            }
        conn.close();
        }catch(Exception e){
            System.out.println("exception: "+e);
        }
    }

    public void displayRecord(Scanner s){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mypassword");
            String query="select * from users;";

            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getBoolean(4));
            }
        conn.close();
        }catch(Exception e){
            System.out.println("exception: "+e);
        }
    }

    public void modifyRecord(Scanner s){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mypassword");
            System.out.println("enter the id you want to change: ");
            int id_number=s.nextInt();
            
            System.out.print("enter name ");
            String name =s.next();
            System.out.print("enter age ");
            int age=s.nextInt();
            System.out.print("enter active ");
            boolean active=s.nextBoolean();
            String query="update users set name=?, age=?, active =? where id=?";

            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setBoolean(3, active);
            ps.setInt(4, id_number);
            ps.executeUpdate();
            
            String query2="select * from users;";

            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(query2);

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getBoolean(4));
            }
        conn.close();
        }catch(Exception e){
            System.out.println("exception: "+e);
        }
    }

    public void deleteRecord(Scanner s){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mypassword");
            System.out.println("enter the id you want to change: ");
            int id_number=s.nextInt();

            String query="delete from users where id=?";

            PreparedStatement ps=conn.prepareStatement(query);
            ps.setInt(1, id_number);

            ps.executeUpdate();
            String query2="select * from users;";

            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(query2);

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getBoolean(4));
            }
        conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void searchRecord(Scanner s){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mypassword");
            System.out.println("enter the id you want to search: ");
            int id_number=s.nextInt();
            
            String query="select * from users where id="+id_number+";";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(query);


            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getBoolean(4));
            }

    }catch(Exception e){
        System.out.println(e);
    }}
}
class javasql1{
    public static void main(String[]args){
       Scanner s=new Scanner(System.in);

       boolean tocontinue = true;
        myCommands mycommand=new myCommands();
        while(tocontinue){
       System.out.println("\nwhatchu looking for: 1.add record 2.display record 3.modify record 4.delete record 5.search record 6:End it");

       int request_no =s.nextInt();
       switch(request_no){
        case 1:
            mycommand.addRecord(s);
            break;
       case 2:
            mycommand.displayRecord(s); 
            break;
       case 3:
            mycommand.modifyRecord(s);
            break;
        case 4:
            mycommand.deleteRecord(s);
            break;
        case 5:
            mycommand.searchRecord(s);
            break;
        default:
            tocontinue = false;
        }
    }
    s.close();
}
}  
