

package homework;
import java.util.*;

public class P7_28 {

   
    public static void main(String[] args) {
        int count=0;
           Scanner input=new Scanner(System.in);     
        System.out.println("輸入10個整數");
        int num[]=new int[10];
        
        for (int i=0;i<num.length;i++)
        {
            num[i]=input.nextInt();
        }
        for (int i=0;i<num.length;i++)
        {          
           for (int j=i+1;j<num.length;j++)
            {
                System.out.print(" "+num[i]+","+num[j]+" ");
                System.out.print(" "+num[j]+","+num[i]+" ");
                count+=1;
                if(count%10==0)
                {
                     System.out.print("\n");
                }
            }
    }
    }

}
