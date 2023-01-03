
import java.util.Scanner;

public class P3_22 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         double x1,y1,d;
         System.out.print("Enter a point with two coordinates: ");         
        x1=input.nextDouble();
        y1=input.nextDouble();
       d=Math.pow(Math.pow(x1,2)+Math.pow(y1,2),0.5);
       if (d <=10)
       {
           System.out.print("Point("+x1+","+y1+") is in the circle");
       }
       else
           System.out.print("Point("+x1+","+y1+") is not in the circle");
    }

}
