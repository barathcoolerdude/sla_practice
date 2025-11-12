import java.io.*;
import java.util.*;

class sample8
{
public static void main(String []ars)
{
System.out.println("enter the year");
Scanner s=new Scanner (System.in);

int years= s.nextInt();
boolean isLeapYear;

 if (years % 100 == 0 || years % 400 == 0) {
            isLeapYear = false;
        } else if (years % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
if (isLeapYear)
{
System.out.println(years + "is a leap year");
}
else
{
System.out.println(years + "is a not leap year");
}
s.close();
}
}