
package homework;

import java.util.Scanner;
public class P2_2 {

   
    public static void main(String[] args) {
       double area ;
        double length ;
        double volume ;
        
      
        System.out.print("Enter length of sides and height of the Equilateral triangle ");
         Scanner input = new Scanner(System.in);
         length=input.nextDouble();
         area=(Math.pow(3,0.5)/4)*Math.pow(length, 2);
         volume=area*length;
         System.out.println("The length is "+length);
         System.out.println("The area is "+area);
         System.out.println("The volume of the Triangular prism is  "+volume);
    }
    
}
