class myclass{
    public int with_para_with_return(int a){
        int c = a+a;
        return c;
    }

    public int without_para_with_return(){
        return 4;
    }
    public void with_para_without_return(int a){
        System.out.println(a);
    }
    public void without_para_without_return(){
        System.out.println("non sense");
    }
}
public class javasample21{
    public static void main(String []args){
        myclass obj=new myclass();
        int result = obj.with_para_with_return(4);
        int result2 = obj.without_para_with_return();
        obj.with_para_without_return(3);
        obj.without_para_without_return();
        System.out.println("reusult: "+result);
        System.out.println("reusult: "+result2);

    }
}