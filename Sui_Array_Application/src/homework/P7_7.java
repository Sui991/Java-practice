

package homework;

public class P7_7 {

    
    public static void main(String[] args) {
        int num[]=new int [10];int ran;
        for (int i=1;i<=200;i++)
        {
            ran=(int)(Math.random()*10);
            num[ran]=num[ran]+1;
        }
        for (int h=0;h<=9;h++)
        {
            System.out.println(h+"有"+num[h]+"個");
        }
     
        }
        
    }


