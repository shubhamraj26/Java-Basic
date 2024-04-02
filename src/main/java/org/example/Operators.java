package org.example;

public class Operators {
    public static void main(String[] args) {
        int num1=4;
        int num2=8;
        //java filename.java
        int result =num2/num1;
        System.out.println(result);//2
        result=num1%num2;
        System.out.println(result);
//TODO: increase the value of num1 by 1
        num1+=1; // or num1++; or ++num1;
//TODO: decrement the value of num 2
        num2-=1; // or num--; or --num2;
        //operators  + - * / % = ++ -- etc
//TODO: relational operators
//        <,>,=
        boolean is_greater=6>5;
        System.out.println(is_greater);
        boolean is_equale=6==4;
        System.out.println(is_equale);
        boolean equale_or_not=6!=7;
        System.out.println(equale_or_not);
//        short circuit
//        && || !

    }
}
