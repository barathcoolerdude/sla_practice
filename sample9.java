import java.util.*;
public class sample9{
    public static void main(String []args){
        // for(int i = 0;i<3;i++){
        //     for(int j = 0;j< 3;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        

        // for(int i = 1;i<=3;i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        //     for(int i=0; i<=3;i++){
        //         for(int j=1;j<=i;j++){
        //             System.out.print(j+" ");
        //         }
        //         System.out.print("\n");
        //     }

        //     for(int i=0; i<=3;i++){
        //         for(int j=1;j<=i;j++){
        //             System.out.print(i+" ");
        //         }
        //         System.out.print("\n");
        //     }

        //     int count = 1;
        //     for(int i=0; i<=3;i++){
        //         for(int j=1;j<=i;j++){
        //             System.out.print(count+" ");
        //             count++;
        //         }
        //         System.out.print("\n");
        //     }

    //    int count = 1; 
    //     for(int i = 1;i<=6;i++){
    //         for(int j=1; j<count;j++){
    //             System.out.print("*"); 
    //         }
    //         if(i <=3){
    //             count++;
    //         }else{
    //             count--;
    //         }
    //         System.out.print("\n");
    //     }

    // for(int i = 1;i<=3;i++){
    //     for(int j =1;j<i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.print(i+" \n");
    // }
    

    for(int i=1;i<=3;i++){
        for(int j=1;j<=(i-1)*2;j++){
            System.out.print("*");
        }
        for(int j=0;j<2;j++){
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }

    }
}