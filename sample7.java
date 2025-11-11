import java.util.*;

public class sample7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int number = 100; number < 999; number++) {
            int sum = 0;
            int temp = number;
            int number_copy = number;
            int reminder;
            while (temp> 0) {
                reminder = temp % 10;
                sum += reminder * reminder * reminder;
                temp/= 10;
            }
            if (number_copy == sum) {
                System.out.println("it's armstrong: "+ sum);
            }
        }
        s.close();
    }
}