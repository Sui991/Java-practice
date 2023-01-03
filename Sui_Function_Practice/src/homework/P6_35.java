

package homework;
import java.util.Scanner;
public class P6_35 {

    
    public static void main(String[] args) {
        double area1,side;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the sied: ");
        side=input.nextDouble();
        area1=area(side);
        System.out.print("The area of the pentagon is "+area1);
    }
public static double area(double side)
{  double Area;
     double degrees = 36.0;
     double radians = Math.toRadians(degrees);
    Area=(5*Math.pow(side,2))/(4*Math.tan(radians));
    return Area;
}
}
