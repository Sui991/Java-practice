/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author user
 */
public class Rectangle {
    private double width=1,height=1;
   
    public static double h;
    public static double w;
    public Rectangle()
    {
        
    }
    public Rectangle(double newWidth,double newHeight)
    {
        this.width=newWidth;
        w=width;
        this.height=newHeight;
        h=height;
    }
    public double getArea()
    {
        return w*h;
    }
    public double getPerimter()
    {
        return 2*w+2*h;
    }
}
