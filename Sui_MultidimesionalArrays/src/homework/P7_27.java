

package homework;
import java.util.*;

public class P7_27 {

   
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
            System.out.println("Two lists are identical");
        }
        else
        {
            System.out.println("Two lists are not identical");
        }
    }
public static boolean equals(int [] list1,int[] list2)
{ boolean equa=true;
    int temp;
    int count=0;
    int ff;
        for (int i=0;i<list1.length-1;i++)
     {
            for (int j=0;j<list1.length-1-i;j++)
            {
                if (list1[j]<list1[j+1]  )
                {
                    temp=list1[j];
                    list1[j]=list1[j+1];
                    list1[j+1]=temp;
                }
            }
        }
           for (int i=0;i<list2.length-1;i++)
     {
            for (int j=0;j<list2.length-1-i;j++)
            {
                if (list2[j]<list2[j+1]  )
                {
                    ff=list2[j];
                    list2[j]=list2[j+1];
                    list2[j+1]=ff;
                }
            }
        }
   
    for (int i=0;i<list1.length;i++)
    {
        if (list1[i]==list2[i])
        {
            count+=1;
           
        }
        else
        {
              count-=1;
        }
    }
    if (count==list1.length)
    {
        equa=true;
    }
    else 
    {
        equa=false;
    }
        return equa;
  
}

}
