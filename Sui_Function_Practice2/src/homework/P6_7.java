


package homework;

import java.util.Scanner;
public class P6_7 {

   
    public static void main(String[] args) {
            double invest,rate,value;int years=1;
       Scanner input=new Scanner(System.in);
         System.out.println("The amount invested:");
         invest=input.nextDouble();
         System.out.println("Annual interest rate:");
       rate=input.nextDouble();
       rate=rate/100;
       System.out.println("Years"+"              "+"Future Value");
       for (int i=years;years<=30;years++)
      {
           
             value=futureInvestmentValue(invest,rate,years);
             System.out.print(years+"              "+value+"\n");
      }
     
       
       System.out.print(invest);
    }
  public static double futureInvestmentValue( double invest, double rate, int years) {
      double futureinvest;
     futureinvest=invest*Math.pow((1+rate/12),(years*12));
      return futureinvest;
  }
}
