import java.util.*;
public class sample4{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String consent = "y";
        while(consent.equals("y")){
                System.out.println("do you want to keep playing:[y/n] ");
                String new_consent = s.nextLine();
                consent = new_consent;
            }
        s.close();
        }
}
