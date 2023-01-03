

package homework;
import java.util.Scanner;
public class P6_5 {

    
    public static void main(String[] args) {
        double num_1,num_2,num_3,t;
        Scanner input = new Scanner(System.in);
        System.out.println("輸入三個整數");
        num_1=input.nextDouble();
        num_2=input.nextDouble();
        num_3=input.nextDouble();
        displaySortedNumbers( num_1,num_2,num_3);
        
        
    }
public static void displaySortedNumbers(double n_1,double n_2,double n_3){
    double t=0;
     for (int i=0; i<3;i++)
            {
            if (n_2>n_1)
            {                
                t=n_2;n_2=n_1;n_1=t;t=0;
            }
            else if (n_3>n_2 )
            {
                t=n_3;n_3=n_2;n_2=t;t=0;
            }
            }
     System.out.println(n_1);
       System.out.println(n_2);
         System.out.println(n_3);
}
}
