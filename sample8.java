import java.util.*;
public class sample8{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = s.nextInt();
        s.nextLine();
        for(int i =1; i<11; i++) {
            System.out.println(number+" x "+i+" ="+(number*i));
        }
        s.close();
    }
}