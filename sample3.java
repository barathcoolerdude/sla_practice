import java.util.*;
class Car{
    String color;
    private String key = "hello";

    int mileage(int dist, int liters){
        int  mileage= dist / liters;
        return mileage;
    }
    String get_key(){
        return key;
    }
}
public class sample3{
    public static void main(String []args){
        Car mycar = new Car();
        mycar.color = "red";
        Scanner s=new Scanner(System.in);
        System.out.println("enter distance traveled and liters used: ");
        int dist = s.nextInt();
        s.nextLine();
        int liters = s.nextInt();
        s.nextLine();
        int total_can_travel = mycar.mileage(dist, liters);
        System.out.println("mileage pre liter is: "+ total_can_travel);

        System.out.println("do you want to see the key[y/n]? ");
        String to_see_key = s.nextLine();
        if (to_see_key.equals("y")){
            String key = mycar.get_key();
            System.out.println("my key: "+ key);
        }
        s.close();
    }
}