package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String result = formatName("Mari", "Aspuria");
        System.out.print(result);
    }

    public static String formatName(String first, String last){
        return last + ", " + first;
    }

}
