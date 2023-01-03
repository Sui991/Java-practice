
import java.util.Scanner;


public class p3_1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,r1,r2;
        System.out.println("Enter a,b,c");
        a=input.nextDouble();
         b=input.nextDouble();
          c=input.nextDouble();
        d=Math.pow(b,2)-4*a*c;
        r1=(-b+(Math.pow(Math.pow(b,2)-(4*a*c),0.5)))/(2*a);
        r2=(-b-(Math.pow(Math.pow(b,2)-(4*a*c),0.5)))/(2*a);
        if (d>0)
        { System.out.println("The equation has two roots"+r1 + " and " + r2);
             }
        else if (d==0)
        {
            System.out.println("The equation has one root"+r1 );
        }
        else if (d<0)
        {
             System.out.println("The equation has no real roots" );
        }
    }

}
