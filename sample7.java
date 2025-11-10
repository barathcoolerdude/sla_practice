import java.util.*;
public class sample7{
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number");
        int number = s.nextInt();
        s.nextLine();
        int sum = 0;
        int reminder;
        while(number > 0){
            reminder = number % 10;
            System.out.println("reminder: "+ reminder);
            sum += reminder;
            number /= 10;
        } 
        System.out.println("sum is: "+ sum);
        s.close();
    }
}