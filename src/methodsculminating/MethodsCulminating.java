/*
 * Peter Horne-Deus 
 * This program gives you 10 options that all do different things
 * MethodsCulmination.java
 * November 9, 2018
 */

package methodsculminating;

import java.util.Scanner;
import java.util.Random;


public class MethodsCulminating {
    
    
    
    public static void main(String[] args) {
        //Variables
        int play = 1;
        int num;
        double total = 0;
        
        //Scanner Object
        Scanner keyedInput = new Scanner(System.in);

        //Loop to run game
        while(play == 1){
            
            num = desision(keyedInput);
            
            if (num > 5){
                play = aboveFive(num,play,keyedInput,total);
            }
            else if(num <= 5){               
                underFive(num,keyedInput,total);
            }
            
        }
        bye();
    }
    
    /**
     * Outputs the menu and allows user to make a choice of what they would like to do
     * @param keyedInput
     * @param num
     * @return num
     */
    public static int desision(Scanner keyedInput){        
        int num;
        
        //Clear a space from the last question
        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        
        //Output 11 choices of things to do
        System.out.println("Enter a the number corresponding with the action you would like to do");
        
        System.out.println("1... Square Root of a number");
        
        System.out.println("2... Number Squared");
        
        System.out.println("3... Celsius To Fahrenheit");
        
        System.out.println("4... Fahrenheit To Celsius");
        
        System.out.println("5... Area Of A Rectangle");
        
        System.out.println("6... Area Of A Circle");
        
        System.out.println("7... Pythagoras Theorem");
        
        System.out.println("8... Multiply Two Numbers");
        
        System.out.println("9... Divide Two Numbers");
        
        System.out.println("10.. Round Up A Number");
        
        System.out.println("11.. Exit");
        
        
        
        num = keyedInput.nextInt();

        return (num);
    }
    
    /**
     * Calls the methods for 5 of the menu choices
     * @param num 
     */
    public static int aboveFive(int num,int play,Scanner keyedInput,double total){
        if (num == 6){
            areaCircle(keyedInput,total);
        }
        else if (num == 7){
            pTheorem(keyedInput,total);
        }
        else if (num == 8){
            multiply(keyedInput,total);
        }
        else if (num == 9){
            divide(keyedInput,total);
        }
        else if (num == 10){
            roundUp(keyedInput,total);
        }
        else if (num == 11){
            play = 2;
        }
        else{
            System.out.println("Enter a usable number between 1 and 11");
            play = 1;
            
            desision(keyedInput);
        }
        
        return play;
    }
    
    public static void underFive(int num, Scanner keyedInput,double total){

        if (num == 5){
            areaRectangle(keyedInput,total);
            
        }
        else if (num == 4){
            ftc(keyedInput,total);
        }
        else if (num == 3){
            ctf(keyedInput,total);
        }
        else if (num == 2){
            squared(keyedInput,total);
        }
        else if (num == 1){
            sqrt(keyedInput,total);
        }
        else{
            
            System.out.println("Enter a number between 1 and 11");
            desision(keyedInput);
        }
    }
    
    /**
     * rounds up a number
     * @param keyedInput
     * @param total
     * @return total
     */
    public static double roundUp(Scanner keyedInput, double total){
        System.out.println("Enter a number you would like to round up");
        total = keyedInput.nextDouble();
        
        total = Math.ceil(total);
        
        System.out.println("The total is: " + total);
        
        return total;
        
    }
    
    /**
     * divides two numbers
     * @param keyedInput
     * @param total
     * @return total
     */
    public static double divide(Scanner keyedInput, double total){
        double num1,num2;
        System.out.println("Enter two numbers you would like to divide");
        
        System.out.println("Enter the first number");
        num1 = keyedInput.nextDouble();
        
        System.out.println("Enter the second number");
        num2 = keyedInput.nextDouble();
        
        total = num1/num2;
        
        System.out.println("The total is: " + total);
        
        return total;
    }
    /**
     * multiplys two numbers
     * @param keyedInput
     * @param total
     * @return total
     */
    public static double multiply(Scanner keyedInput, double total){
        double num1,num2;
        System.out.println("Enter two numbers you would like to multiply");
        
        System.out.println("Enter the first number");
        num1 = keyedInput.nextDouble();
        
        System.out.println("Enter the second number");
        num2 = keyedInput.nextDouble();
        
        total = num1*num2;
        
        System.out.println("The total is: " + total);
        
        return total;
    }
    
    /**
     * Does a pythagorems therom for a user specified triangle
     * @param keyedInput
     * @param total
     * @return total
     */
    public static double pTheorem(Scanner keyedInput, double total){
        double num1,num2;
        System.out.println("Enter two side lengths of a right side triangle");
        
        System.out.println("Enter the first length");
        num1 = keyedInput.nextDouble();
        
        System.out.println("Enter the second length");
        num2 = keyedInput.nextDouble();
        
        total = Math.sqrt(Math.pow(num1,2) + Math.pow(num2,2));
        
        System.out.println("The total is: " + total);
        
        return total;
    }
    
    /**
     * find the area of a circle with a users dimensions
     * @param keyedInput
     * @param total
     * @return total
     */
    public static double areaCircle(Scanner keyedInput, double total){
        double num1;
        System.out.println("Enter the radius of a circle");

        num1 = keyedInput.nextDouble();
        
        
        total = Math.PI * Math.pow(num1,2);
        
        System.out.println("The total is: " + total + " units suqared");
        
        return total;
    }
    /**
     * find the area of a rectangle with user dimensions
     * @param keyedInput
     * @param total
     * @return total
     */
    public static double areaRectangle(Scanner keyedInput, double total){
        double num1,num2;
        System.out.println("Enter two side lengths of a rectangle");
        
        System.out.println("Enter the first length");
        num1 = keyedInput.nextDouble();
        
        System.out.println("Enter the second length");
        num2 = keyedInput.nextDouble();
        
        total = num1 * num2;
        
        System.out.println("The total is: " + total + " units suqared");
        
        return total;
    }
    
    /**
     * Does a Fahrenheit to Celsius conversion
     * @param keyedInput
     * @param total
     * @return total 
     */
    public static double ftc(Scanner keyedInput, double total){
        double f;
        
        System.out.println("Enter the tempurature in Fahrenheit");
        f = keyedInput.nextDouble();
        
        total = (double)5/(double)9*(f - 32);
        
        System.out.println("The total is: " + total);
        
        return total;
    }
    
    /**
     * Does a Celsius to Fahrenheit conversion
     * @param keyedInput
     * @param total
     * @return total
     */
    public static double ctf(Scanner keyedInput, double total){
        double c;
        
        System.out.println("Enter the tempurature in Celcuis");
        c = keyedInput.nextDouble();
        
        total = (double)9/(double)5*c + 32;
        
        System.out.println("The total is: " + total);
        
        return total;
    }
    
    /**
     * Squares a user entered number
     * @param keyedInput
     * @param total
     * @return total
     */
    public static double squared(Scanner keyedInput, double total){
        System.out.println("Enter a number you would like squared");
        total = keyedInput.nextDouble();
        
        total = Math.pow(total, 2);
        
        System.out.println("The total is: " + total);
        
        return total;
    }
    
    /**
     * Does the square root calculations of a user inputed number
     * @param keyedInput
     * @param total
     * @return total
     */
    public static double sqrt(Scanner keyedInput, double total){
        System.out.println("Enter a number you would like square rooted");
        
        total = keyedInput.nextDouble();
        
        total = Math.sqrt(total);
        
        System.out.println("The total is: " + total);
        
        return total;
    }
    
    /**
     * This method outputs a leaving message
     */
    public static void bye(){
        System.out.println("Good Bye");
    }
}
