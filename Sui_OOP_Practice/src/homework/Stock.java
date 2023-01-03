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
public class Stock {
    private String symbol="";
    private String name="";
    public static String s;
    public static String n;
    private double previousClosingPrice=34.5;
    private double currentPirce=34.35;
    public Stock(String newsymbol,String newname)
    {
        this.symbol=newsymbol;
        s=symbol;
        this.name=newname;
        n=name;
    }
    public double getChangePercent()
    {
        return (Math.abs(currentPirce-previousClosingPrice))/previousClosingPrice;
    }
}
