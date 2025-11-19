import java.util.*;

class Jet{
    private static int entered_jet = 0;
    private static int displayed_jet = 1;
    public String name;
    public int pay_load;
    public String model;

    public void create(Scanner s,int[] hanger){
        System.out.println("enter name, payload and model: "+entered_jet);
        entered_jet+=1;
        name = s.next();
        pay_load = s.nextInt();
        model = s.next();
        hanger[entered_jet - 1] = pay_load;
        System.out.println("object created! ");
    }

    public void display(){
        System.out.println("diaplay no: "+displayed_jet+"name: "+name+" payload: "+pay_load+" model: "+(model+1));
        displayed_jet += 1;
    }

    public void best_payload(int[] hanger){
        int best_payload = 1;
        for(int i=0;i < (hanger.length - 1);i++){
            if(hanger[i]<hanger[i+1]){ // i: 0 i+1: 1
                best_payload = i+2;
            }
        }
        System.out.println("the jet with best payload is jet"+best_payload);
    }

}



public class sample13{
        static int[] hanger=new int[5];
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("this is class and oject program: ");
        Jet jet1=new Jet();
        Jet jet2=new Jet();
        Jet jet3=new Jet();
        jet1.create(s,hanger);
        jet2.create(s,hanger);
        jet3.create(s,hanger);
        jet1.display();
        jet2.display();
        jet3.display();
        

        // best payload range
        jet1.best_payload(hanger);
    s.close();
    }
}