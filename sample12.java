import java.util.*;

public class sample12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        missile missile1 = new missile();
        missile missile2=new missile();
        missile1.load(s);
        missile2.load(s);
        missile1.fire();
        missile2.fire();
        s.close();
    }
}

class missile{
    private static int count =1;
    private static int enter_count = 0;
    private String name;
    private String mode;
    private int fuel;

    public void load(Scanner s) {
        enter_count += 1;
        System.out.println("enter missile "+enter_count+" name:");
        name=s.next();
        System.out.println("enter mode: ");
        mode=s.next();
        System.out.println("enter fuel: ");
        fuel = s.nextInt();
    }

    public void fire(){
        System.out.println("fox: "+count+" desigination "+name+  " in "+mode+" with "+fuel);
        count+=1;
    }
}
