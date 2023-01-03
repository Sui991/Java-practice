

package homework;
import java.util.*;

public class P7_26 {

   
    public static void main(String[] args) {
       boolean equal=false;
        Scanner input=new Scanner(System.in);     
        System.out.println("Enter list1:");
        int i=input.nextInt();
        int list1[]=new int[i];
       
        for (int h=0;h<list1.length;h++)
        {
            list1[h]=input.nextInt();
        }
        System.out.println("Enter list2:");
        int j=input.nextInt();
        int list2[]=new int[j];
        for (int h=0;h<list2.length;h++)
        {
            list2[h]=input.nextInt();
        }
        equal=equals(list1,list2);
        if (equal)
        {
            System.out.println("Two lists are strictly identical");
        }
        else
        {
            System.out.println("Two lists are not strictly identical");
        }
    }
public static boolean equals(int [] list1,int[] list2)
{
    boolean equal=true;
    for (int i=0;i<list1.length;i++)
    {
        if (list1[i]==list2[i])
        {
            equal=true;
        }
        else
        {
            equal=false;
        }
    }
        return equal;
  
}

}
