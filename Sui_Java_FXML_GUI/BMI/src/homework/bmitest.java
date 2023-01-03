

package homework;

/**
 *
 * @author admin
 */
public class bmitest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bmi bill = new bmi(175, 70);
        bill.setHeight(175);
        bill.setWeight(70);
        bill.info();
        bmi c = new bmi();
        c.setHeight(175);
        c.setWeight(100);
        c.info();

        bill.setHeight(175);
        bill.showHeight();
        bill.setWeight(70);
        System.out.println("bmi: " + bill.getBmi());
        System.out.println("suggestion: " + bill.suggest());
        bmi willy = new bmi();
        willy.setHeight(180);
        willy.setWeight(100);
        System.out.println("bmi: " + willy.getBmi());
        System.out.println("suggestion: " + willy.suggest());

    }
}

