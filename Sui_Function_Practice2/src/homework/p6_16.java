


package homework;

import java.util.Scanner;
public class p6_16 {

   
    public static void main(String[] args) {
        int day,years;
        for (years=2014;years<=2034;years++)
        {
            day=numberOfDaysInAYear(years);
            System.out.print(day+" ");
        }
    }
public static int numberOfDaysInAYear (int year){
    int days=365;
        if (year%4==0&&year%100!=0)
        {
            days+=1;
        }
        else if (year%400==0)
        {
            days+=1;
        }
        else 
            days+=0;
        return days;
    }
}
