package org.example;

import java.sql.SQLOutput;

public class Greatest_Among_Three_NUmber {
    public static void main(String[] args) {
        int x=8;
        int y=9;
        int z=10;
        if(x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
            else System.out.println(z);

//        ternary
            int number=4;
        System.out.println(number%2 ==0 ? true : false);

//        switch ()
        int day=1;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("T");
                break;
            case 3:
                System.out.println("W");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("F");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("give number between 1 and 7");

        }

    }


}
