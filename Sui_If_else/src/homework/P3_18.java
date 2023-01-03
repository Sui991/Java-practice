

import java.util.Scanner;

public class P3_18 {

    
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        int w,c;
         System.out.print("輸入包裹的重量");
        w=input.nextInt();
        if (w<=20 && w>10 )
{ System.out.print("運費為10.5");
}
        
else if ( w<=10 && w>4 )
{System.out.print("運費為7.5");
}
else if (  w<=4 && w>2)
{System.out.print("運費為4.5");
}
else if (  w<=2 && w>0)
{System.out.print("運費為2.5");
}
else 
    System.out.print("the package cannot be shipped");
   

 }
}