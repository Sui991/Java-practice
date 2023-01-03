

package homework;
import java.util.*;
public class P7_12 {

    
 

    public static void main(String[] args) {
        int [] array=new int[10];
       Scanner input=new Scanner(System.in);
       System.out.println("輸入10個整數");
       for (int i=0;i<array.length;i++)
       {
           array[i]=input.nextInt();
       }  
       int array1[]=Arrayreverse(array);
       display(array1);
    }
     
       public static int[] Arrayreverse(int[] array)
       {
              int j;
        int temp;
        for (int i=0;i<array.length/2;i++)
        {
            j=array.length-1-i;
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        
        return array;
    }
        public static void display(int[]array)
 {
     for (int i=0; i<array.length; i++)
{
System.out.print(array[i]+" ");
}

 }
     

}
