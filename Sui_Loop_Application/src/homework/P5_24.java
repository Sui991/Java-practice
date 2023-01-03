

package homework;

public class P5_24 {

    
    public static void main(String[] args) {
        double ans=0,b=1;
        for (int i=1;i<98;i+=2)
            ans=ans+(i/(b+i));
        System.out.print(ans);
    }

}
