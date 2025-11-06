import java.util.*;
public class salary_reducted {
   public static void main(String []args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter original salary: ");
        float original_salary=s.nextInt();
        s.nextLine();
        System.out.println("original  salary: " + original_salary);
        System.out.println("enter new salary: ");
        float new_salary =s.nextInt();
        s.nextLine();
        System.out.println("new_salary: " + new_salary);
        float deducted_amount = original_salary - new_salary;
        float precentage_of_reduction = (deducted_amount / original_salary) * 100;
        System.out.println("precentage of loss:" + precentage_of_reduction);
        s.close();

   }
}
