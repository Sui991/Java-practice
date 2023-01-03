/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bmi {



    private int height;
    private int weight;

    public bmi() {
        System.out.println("新物件產生!沒有給身高體重!");
    }
//建構子Constructor 初始化初值需要在此被設定!!!

    public bmi(int h, int w) {
        height = h;
        weight = w;
        System.out.println("新物件產生!有身高體重!");
    }

    public void info() {
        System.out.println("身高:" + height);
        System.out.println("體重:" + weight);
        System.out.println("bmi: " + getBmi());
        System.out.println("suggestion: " + suggest());
    }

    public String suggest() {
        double bmi = getBmi();
        String suggest;
//suggest
        if (bmi < 18.5) {
            suggest = "體重過輕!";
        } else if (bmi < 24) {
            suggest = "正常範圍!";
        } else if (bmi < 27) {
            suggest = "過重!";
        } else if (bmi < 30) {
            suggest = "輕度肥胖!";
        } else if (bmi < 35) {
            suggest = "中度肥胖!";

        } else {
            suggest = "重度肥胖!";
        }
        return suggest;
    }

    public double getBmi() {
        return weight / Math.pow(height / 100.0, 2);
    }

    public void setHeight(int h) {
        height = h;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public void showHeight() {
        System.out.println("height: " + height);
    }

}
