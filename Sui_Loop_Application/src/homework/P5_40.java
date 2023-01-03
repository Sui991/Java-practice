

package homework;

public class P5_40 {

   
    public static void main(String[] args) { 
        int front=0,back=0,count=0,a=0;
        while (count<20000)
                {
                    a=1+(int)(Math.random()*2);
                    if (a==1)
                    {
                        front+=1;
                        count+=1;
                    }
                    else if (a==2)
                                {
                                back+=1;
                               count+=1;
                                }
                    
                            
                }
        System.out.println("Front :"+front+"\nBack :"+back);
    }

}
