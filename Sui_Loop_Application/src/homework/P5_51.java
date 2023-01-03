package homework;

import java.util.Scanner;

public class P5_51 {

    public static void main(String[] args) {
        int year = 1;
        Scanner input = new Scanner(System.in);
        while (year != 0) {
            System.out.print("Enter year:");
            year = input.nextInt();
            if (year == -1) {
                System.out.println("over");
                break;
            }
            if (year % 4 == 0 && year % 100 != 0) {
              
                    System.out.println("It is leap year");
            }
                    else if (year%400==0)
                            {
                              System.out.println("It is leap year");
                            }
                   
                else {
                    System.out.println("It is not leap year");
                        }
         
        }
    }
}
