

import java.util.Scanner;


public class P3_8 {

    
    public static void main(String[] args) {
       
      int num_1,num_2,num_3,t;
        Scanner input = new Scanner(System.in);
        System.out.println("輸入三個整數");
        num_1=input.nextInt();
        num_2=input.nextInt();
        num_3=input.nextInt();
        
            for (int i=0; i<3;i++)
            {
            if (num_2>num_1)
            {                
                t=num_2;num_2=num_1;num_1=t;t=0;
            }
            else if (num_3>num_2 )
            {
                t=num_3;num_3=num_2;num_2=t;t=0;
            }
            }
           
            System.out.print(num_1+" ");
            System.out.print(num_2+" ");
            System.out.print(num_3+" ");
                 }
            }
                
        
        
    


