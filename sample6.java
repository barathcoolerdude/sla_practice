import java.util.*;
public class sample6{
    public static void main(String []args){
        int[] arr = {10, 20, 30, 40, 50, 10, 30, 10};
        Scanner s=new Scanner(System.in);
        // System.out.println("enter number: ");
        // int target = s.nextInt();
        // int count = 0;
        // s.nextLine();
        // for(int i = 0; i< (arr.length);i++){
        //     if(arr[i] == target){
        //         count += 1;
        //     }
        // }
        // System.out.println("number of occurnces: "+ count);
        
        // int[] big_arr = {12,45,56,32,46,32,67,54,75,24,86,46,75,65};
        // int big_number = big_arr[0];
        // for(int i = 0; i< (big_arr.length);i++){
        //     if(big_arr[i] > big_number){
        //         big_number = big_arr[i];
        //     }
        // }
        // System.out.println("biggest number: "+ big_number);

        System.out.println("number of occurnce of each element: ");
        // with out any duplicates
        int unique_count = 0;
        int[] unique_arr =new int[arr.length];
        for(int i=0;i<(arr.length);i++){
            int current = arr[i];
            boolean isdup = false;
            for(int j=0;j<unique_count;j++){
                if(current == unique_arr[j]){
                    isdup = true;
                    break;
                }
            }
            if(!isdup){
                unique_arr[unique_count]= current;
                unique_count++;
            }
        }
        int length = 0;
        for(int i = 0;i<unique_arr.length; i++){
            if(unique_arr[i] != 0){
                length++;
            }
        }
        int[] unique = Arrays.copyOf(unique_arr, length);

        for(int i =0;i<unique.length;i++){
            System.out.println("value: "+unique[i]);
        }
        for(int i=0; i<(unique.length); i++){
            int count =0;
            for(int j=0;j<(arr.length);j++){
                if(arr[j]==unique[i]){
                    count += 1;
                }
            } 
        System.out.println("number count for: "+arr[i]+" is "+ count);
        }

        s.close();
    }
}