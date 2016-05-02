package io.zipcoder.calculator;

import java.util.Scanner;

public class Display {

    public static Scanner input = new Scanner(System.in);

    public static int promptUserForIntegerValue (String msg){
        promptUser(msg);
        return input.nextInt();
    }

    public static double promptUserForDoubleValue(String msg){
        promptUser(msg);
        return input.nextDouble();
    }

    public static void promptUser(String msg){
        System.out.println(msg);
    }
}
