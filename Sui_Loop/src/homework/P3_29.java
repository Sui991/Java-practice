


package homework;
import java.util.Scanner;

public class P3_29 {

   
    public static void main(String[] args) {
        double x,y,x2,y2,r1,r2,d;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter circle1's center x-,y-coordinates , and radius:");
        x=input.nextDouble();
        y=input.nextDouble();
        r1=input.nextDouble();
         System.out.println("Enter circle2's center x-,y-coordinates , and radius:");
        x2=input.nextDouble();
        y2=input.nextDouble();
        r2=input.nextDouble();
        d=Math.pow(Math.pow(x2-x,2)+Math.pow(y2-y,2),0.5);
        if (d<=Math.abs(r1-r2))
        {
            System.out.println("circle2 is inside circle1");
        }
        else if (d<=r1+r2)
        {
            System.out.println("circle2 is overlaps circle1");
        }
          else 
              System.out.println("circle2 does not overlaps circle1");
     
        
    }

}
