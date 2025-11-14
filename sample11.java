import java.util.*;

class IfArmstrong {
    private int number = 370;

    public boolean pr_armstrong(int a) {
        int sum = 0;
        int temp = a;
        while (a != 0) {
            int last_digit = a % 10;
            sum += last_digit * last_digit * last_digit;
            a = a / 10;
            System.out.println("sum: " + sum + " a: " + a);
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }

    public boolean r_armstrong() {
        int sum = 0;
        int temp = number;
        while (number != 0) {
            int last_digit = number % 10;
            sum += last_digit * last_digit * last_digit;
            number = number / 10;
            System.out.println("sum: " + sum + " a: " + number);
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }

    public void armstrong() {
        int sum = 0;
        int temp = number;
        while (number != 0) {
            int last_digit = number % 10;
            sum += last_digit * last_digit * last_digit;
            number = number / 10;
            System.out.println("sum: " + sum + " a: " + number);
        }
        if (temp == sum) {
            System.out.println("result for no para and no return: " + true);
            return;
        }
        System.out.println("result for no para and no return: " + false);
    }

    public void p_armstrong(int a) {
        int sum = 0;
        int temp = a;
        while (a != 0) {
            int last_digit = a % 10;
            sum += last_digit * last_digit * last_digit;
            a = a / 10;
            System.out.println("sum: " + sum + " a: " + a);
        }
        if (temp == sum) {
            System.out.println("result for no para and no return: " + true);
            return;
        }
        System.out.println("result for no para and no return: " + false);
    }

}

public class sample11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int year = s.nextInt();

        IfArmstrong ifarmstrong = new IfArmstrong();

        boolean result = ifarmstrong.pr_armstrong(year);
        System.out.println("result for with para and return: " + result);
        boolean result1 = ifarmstrong.r_armstrong();
        System.out.println("result for no para and with return: " + result1);
        ifarmstrong.armstrong();
        System.out.println("enter for with para and no return: ");
        int input= s.nextInt();
        ifarmstrong.p_armstrong(input);

        s.close();

    }
}