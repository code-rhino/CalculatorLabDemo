package io.zipcoder.calculator;

public class Calculator {

    public static double memory = 0;

    public static void resetMemory(){
        memory = 0;
    }

    public static int add(int input1, int input2){
        memory = input1 + input2;
        return (int) memory;
    }

    public static int subtract(int input1, int input2){
        memory = input1 - input2;
        return (int) memory;
    }

    public static int multiply(int input1, int input2){
        memory = input1 * input2;
        return (int) memory;
    }

    public static double divide(double input1, double input2){
        memory = input1 / input2;
        return memory;
    }


}
