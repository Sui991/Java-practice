

import java.util.Scanner;

public class P2_21 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double invest,rate,year,value;
       System.out.print("Enter investment amount: ");
       invest=input.nextDouble();
       System.out.print("Enter annual interest rate in percentage: ");
       rate=(input.nextDouble());
       System.out.print("Enter number of years: ");
       year=input.nextDouble()*12;
       value=invest*Math.pow(1+(rate*0.01/12), year);
       System.out.print("Accumulated value is " +value);
    }

}
