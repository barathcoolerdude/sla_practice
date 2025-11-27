interface interface1 {
    void displaydate();
    void displaymonth();
    void displayyear();
}

class myclass implements interface1 {
    public void displaydate() {
        System.out.println(" code to display date ");
    }
    public void displaymonth() {
        System.out.println(" code to display month ");
    }
    public void displayyear() {
        System.out.println(" code to display year ");
    }
}

abstract class myclass2 implements interface1{
}

class abstract_child extends myclass2{
    public void displaydate(){

    }
    public void displaymonth(){
    }
    public void displayyear(){

    }
}
class sample15 {
    public static void main(String[] args) {
        myclass m1 = new myclass();
        m1.displaydate();
        m1.displaymonth();
        m1.displayyear();
    }
}