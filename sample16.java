import java.util.*;
class sample16{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter quasiante and divide");
        int quasiant = s.nextInt();
        int divider = s.nextInt();
        try{
            int result = quasiant/divider;
            System.out.println(result);

            int[] arr={1,2,3};
            System.out.println("index 10th element: "+arr[9]);

        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("arithmetic operation complete");
        }

        try{
        Thread.sleep(2000);
        System.out.println("alo");
        }catch(Exception e){
            System.out.println("ching chang");
        }
        s.close();
    }
}