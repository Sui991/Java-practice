

package homework;
import java.util.Scanner;
public class P5_2_1 {

    
    public static void main(String[] args) {
        int rnd,number=101;
        rnd=(int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a magic number between 0 and 100");
        
        while(number!=rnd)
        {
              System.out.print("\nEnter your guess:");
            number=input.nextInt();
            if (number>rnd)
            {
                System.out.print("\nYour guess is too high");
            }
            else if (number<rnd)
            {
                 System.out.print("\nYour guess is too low");
            }
            
        }
         System.out.print("\nYes, the number is "+number);
    }

}
