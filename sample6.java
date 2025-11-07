import java.util.*;
public class sample6{
    public static void main(String []args){
        int[] arr = {10, 20, 30, 40, 50, 10, 30, 10};
        Scanner s=new Scanner(System.in);
        System.out.println("enter number: ");
        int target = s.nextInt();
        int count = 0;
        s.nextLine();
        for(int i = 0; i< (arr.length);i++){
            if(arr[i] == target){
                count += 1;
            }
        }
        System.out.println("number of occurnces: "+ count);
        
        int[] big_arr = {12,45,56,32,46,32,67,54,75,24,86,46,75,65};
        int big_number = big_arr[0];
        for(int i = 0; i< (big_arr.length);i++){
            if(big_arr[i] > big_number){
                big_number = big_arr[i];
            }
        }
        System.out.println("biggest number: "+ big_number);


        s.close();
    }
}