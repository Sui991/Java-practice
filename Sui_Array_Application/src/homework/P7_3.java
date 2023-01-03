

package homework;
import java.util.*;
public class P7_3 {

    
    public static void main(String[] args) {
        
        int n[]=new int [52];
        int j[]=new int [100];
        int num=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 50:");
        
             while(num!=0)
             {
                 int i=input.nextInt();
                 if(i!=0)
                 {
                      n[i+1]=i;
                 j[i+1]+=1;
                 }
                
                 if (i==0)
                 {
                 
                      for (int h=1;h<=51;h++)
                      {
                         if (j[h]!=0)
                         {
                             System.out.print(n[h]+" occurs "+j[h]+" time");
                             if (j[h]>1)
                             {
                                  System.out.print("s");
                             }
                              System.out.print("\n");
                         }
                        
                      }
                     
                      num=0;
                  
                 }
                 
             }
             
    }

}
