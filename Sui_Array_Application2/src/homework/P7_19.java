

package homework;
import java.util.*;

public class P7_19 {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean sorted;
        int n;
        System.out.println("Enter list:");
        n=input.nextInt();
        int list[]=new int[n];
        for (int i=0;i<list.length;i++)
        {
            list[i]=input.nextInt();
        }
        sorted=issorted(list);
        if(sorted)
        {
            System.out.println("The list is already sorted");
        }
        else
        {
            System.out.println("The list is not sorted");
        }
    }
public static boolean issorted(int list[])
{ 
    boolean sorted=true;
     for (int i=0;i<list.length-1;i++)
        {
          if (list[i]<=list[i+1])
          {
              sorted=true;
          }
          else
          {
              sorted=false;
          }
        }
    return sorted;
}
}
