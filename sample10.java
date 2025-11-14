import java.util.*;   
       class calculate{ 

        public int addnumbers(int a,int b){
            int c = a+b;
            return c;
        }

        public int subnumbers(){
           int c =4-3;
           return c; 
        }

        public void multiply(int a,int b){
           System.out.println("with parameter and no return: "+(a*b)) ;
        }

        public void divide(){
            System.out.println("without parameter and no return: "+(14/2));
        }
    } 

public class sample10{
    public static void main(String[]args){
        calculate student1=new calculate();

        int parameterAndReturn = student1.addnumbers(3,4);
        System.out.println("parameter and return: "+ parameterAndReturn);

        int subtract= student1.subnumbers();
        System.out.println("without parameter and return value: "+ subtract);

        student1.multiply(3, 4);

        student1.divide();

    }


}

