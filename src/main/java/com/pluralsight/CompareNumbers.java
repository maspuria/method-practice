package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(3));
        System.out.println(isEven(4));
        System.out.println(isEven(5));

        System.out.println(isPositive(44));
        System.out.println(isPositive(-44));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number){
        return number > 0;
    }


}
