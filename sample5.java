import java.util.*;
public class sample5{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        // int[] saved_numbers = {1,3,5,7,8};
        // for(int i = 0;i<(saved_numbers.length); i++){
        //     System.out.println("number: "+saved_numbers[i]);
        // }
 
        // int[] numbers = new int[5];
        // for(int i = 0;i<(numbers.length); i++){
        //     System.out.println("enter "+i+" number");
        //     numbers[i] = s.nextInt();
        //     s.nextLine();
        // }

        // for(int i = 0;i<(numbers.length); i++){
        //     System.out.println("number: "+numbers[i]);
        // }
        // char[] saved_letters = {'e','t','y','u','w'};
        // for(int i=0; i<(saved_letters.length); i++){
        //     System.out.println("the "+i+" letter is: "+saved_letters[i]);
        // }
        
        // char []letters = new char[5];
        // for(int i = 0;i<(letters.length); i++){
        //     System.out.println("enter the "+i+" letter");
        //     letters[i] = s.next().charAt(0);
        // }
        // for(int i=0; i<(letters.length); i++){
        //     System.out.println("the "+i+" letter is: "+letters[i]);
        // }
        // String[] arr_string = new String[5];
        // for(int i =0; i<(arr_string.length); i++){
        //     System.out.println("enter the "+i+" string");
        //     arr_string[i] = s.nextLine();
        // }
        // for(int i = 0; i<(arr_string.length); i++){
        //     System.out.println(arr_string[i]);
        // }
        
        // find the max number in array
        int[] max_numbers = {34,54,75,23,64};
        int max_number = max_numbers[0] ;
        for(int i =0; i<(max_numbers.length); i++ ){
           if(max_numbers[i] > max_number) {
            max_number = max_numbers[i];
           }
        }
        
        System.out.println("max number is: "+ max_number);
        s.close();
    }
}