import java.util.*;

public class sample12 {
    public static void main(String[] args) {
        missile missile1 = new missile();
        missile missile2=new missile();
        missile1.load();
        missile2.load();
        missile1.fire();
        missile2.fire();
    }
}

class missile{
    private static int count =1;
    private static int enter_count = 0;
    private String name;
    private String mode;
    private int fuel;

    public void load() {
        Scanner s = new Scanner(System.in);
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
