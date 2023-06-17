package com.advance;
import java.text.DecimalFormat;
import java.util.*;
public class LineComparison {
    public static double lineLength() {
        //Variable
        int x1,x2,y1,y2;
        double length;

        //Random generation of points
        x1=(int)(Math.floor(Math.random()*10));
        x2=(int)(Math.floor(Math.random()*10));
        y1=(int)(Math.floor(Math.random()*10));
        y2=(int)(Math.floor(Math.random()*10));

        //Length of a line
        length=(Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1))));
        return length;
    }

    public static String equalsMethod(double length_1, double length_2) {
        Double obj1=new Double(length_1);
        Double obj2=new Double(length_2);
        boolean compare_value=obj1.equals(obj2);

        if(compare_value) {
            return "Both lines are equal";
        }
        else {
            return "Lines are not equal";
        }
    }
    public static String compareToMethod(double length_1, double length_2) {
        Double obj1=new Double(length_1);
        Double obj2=new Double(length_2);
        int value=obj1.compareTo(obj2);

        if(value==0) {
            return "Both lines are equal";
        }
        else if(value>0) {
            return "Length of Line 1 greater than Line 2";
        }
        else {
            return "Length of Line 1 less than Line 2";
        }
    }
    public static void main(String[] args) {

        //Printing welcome message
        System.out.println("Welcome to Line Comparision Computation Program");

        //for rounding off to 2 decimal places
        DecimalFormat df = new DecimalFormat("##.##");

        //Calling the line length computation method
        double Length1=LineComparison.lineLength();
        System.out.println("Length of Line 1"+df.format(Length1));

        double Length2=LineComparison.lineLength();
        System.out.println("Length of Line 2"+df.format(Length2));

        //Calling equals method
        String res_equals=LineComparison.equalsMethod(Length1, Length2);
        System.out.println(res_equals);

        //Calling compareTo methdo
        String res_compare=LineComparison.compareToMethod(Length1, Length2);
        System.out.println(res_compare);
    }
}
