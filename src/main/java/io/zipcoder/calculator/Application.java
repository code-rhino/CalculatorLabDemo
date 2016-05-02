package io.zipcoder.calculator;

import static io.zipcoder.calculator.Display.*;
import static io.zipcoder.calculator.Calculator.*;

public class Application {


    public void engine(){
        boolean flag = true;
        while(flag){
            displayCurrentMemoryValue();
            int choice = promptUserForIntegerValue("\nPress 1)to add 2)subtract 3)multiple 4)divide 5)reset 0)exit");
            switch(choice){
                case 1:
                    addNumbers();
                    break;
                case 2:
                    subtractNumbers();
                    break;
                case 3:
                    multiplyNumbers();
                    break;
                case 4:
                    divideNumbers();
                    break;
                case 5:
                    resetMemory();
                    break;
                case 0:
                    promptUser("Good Bye...");
                    flag = false;
                    break;

            }
        }
    }

    public void displayCurrentMemoryValue(){
        promptUser("The previous value is " + memory);
    }


    public void addNumbers(){
        int a = promptUserForIntegerValue("Please enter and integer to add to current value");
        int sum = add((int) memory ,a);
        promptUser("The sum of " + memory + " + " +a  + " = "+ sum);
    }

    public void subtractNumbers(){
        int a = promptUserForIntegerValue("Please enter and integer to subtract to current value");
        int num = subtract((int) memory ,a);
        promptUser("The difference of " + memory + " - " +a  + " = "+ num);
    }

    public void multiplyNumbers(){
        int a = promptUserForIntegerValue("Please enter and integer to multiply to current value");
        int num = multiply((int) memory ,a);
        promptUser("The product of " + memory + " * " +a  + " = "+ num);
    }

    public void divideNumbers(){
        double a = promptUserForDoubleValue("Please enter and double to divide to current value");
        double num = divide(memory ,a);
        promptUser("The quotient of " + memory + " / " +a  + " = "+ num);
    }

    public static void main(String[] args){
        Application app = new Application();
        app.engine();
    }
}
