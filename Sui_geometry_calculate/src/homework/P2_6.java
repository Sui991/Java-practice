

import java.util.Scanner;

public class P2_6 {

    
    public static void main(String[] args) {
       String number; 
       int len;
       int ans;
       int tran;
       int mod;
       int yo;
       int tre;
       int ga;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter a number bewteen 0 to 1000");
       number=input.nextLine();                     
       tran=Integer.parseInt(number);
       len =number.length();
       mod = tran % 10;
       yo = tran / 10;
       tre = yo / 10 ;
       ga = yo % 10;
       if(len<3)
      { if (len < 2)
        { System.out.println("The multiplication of all digits in "+number+" is "+number);
          }
         else 
      { System.out.println("The multiplication of all digits in "+number+" is "+mod*yo);
          }
      }
      else
      {System.out.println("The multiplication of all digits in "+number+" is "+ga*tre*mod);
              };
              
      
       
       }
    }

    
   
