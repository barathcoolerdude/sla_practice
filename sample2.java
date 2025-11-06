import java.util.*;
public class sample2{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        // int number = s.nextInt();
        // s.nextLine();
        // if (number < 0){
        //     System.out.println("number is negative"+ number);
        // }
        // else if(number%2 == 0){
        //     System.out.println("number is even: " + number);
        // }
        // else{
        //     System.out.println("number is odd: "+ number);
        // }
        System.out.println("enter a number of values you want to add to array");
        int num_numbers = s.nextInt();
        s.nextLine();
        int []number_arr= new int[num_numbers];
        for (int i = 0;i < number_arr.length; i++){
            System.out.println("enter a number " +(i+1)+" slot: ");
            number_arr[i] = s.nextInt();
        }
        for (int i= 0; i < number_arr.length; i++){
            System.out.println("number "+(i+1)+" : "+ number_arr[i]);
        }
        s.close();
    }
}