


package homework;

import java.util.Scanner;
public class P6_14 {

 
    public static void main(String[] args) {
        double m;
        System.out.println("i                       m(i)"+"\n"+"__________________________________________________");
        for (int i=1;i<=901;i+=100)
        {
            
            m=value(i);
             System.out.println(i+"                       "+m);
        }
    }
 public static double value(int i) {
     double m=0;
     for (int h=1;h<=i;h++)
     {
       
      m=m+4*(Math.pow(-1,h+1)/(2*h-1)); 
     }
     return m;
 }
 
}
