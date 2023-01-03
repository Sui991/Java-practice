

package homework;
import java.util.*;
public class P7_17 {

    
    public static void main(String[] args) {
        int scores[] =new int[5];
        String names[]=new String[5];
        Scanner input=new Scanner(System.in);
        System.out.println("輸入5位學生的姓名:");
        for (int i=0;i<names.length;i++)
        {
            names[i]=input.nextLine();
        }
        System.out.println("輸入5位學生的分數:");
        for (int i=0;i<scores.length;i++)
        {
            scores[i]=input.nextInt();
        }
        int temp;
        String name="";
        for (int i=0;i<scores.length-1;i++)
     {
            for (int j=0;j<scores.length-1-i;j++)
            {
                if (scores[j]<scores[j+1]    )
                {
                    name=names[j];
                    names[j]=names[j+1];
                    names[j+1]=name;
                    temp=scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp;
                }
            }
           
           
        } 
        for (int i=0;i<scores.length;i++)
        {
             System.out.println(names[i]+"同學分數為: "+scores[i]);
        }
    }
    }


