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
        
        //Scanner Object
        Scanner keyedInput = new Scanner(System.in);

        //Loop to run game
        while(play == 1){
            
            num = desision(keyedInput);
            
            if (num > 5){
                play = aboveFive(num,play,keyedInput);
            }
            else if(num <= 5){               
                underFive(num,keyedInput);
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
    public static int aboveFive(int num,int play,Scanner keyedInput){
        if (num == 6){
            
        }
        if (num == 7){
            
        }
        if (num == 8){
            
        }
        if (num == 9){
            
        }
        if (num == 10){
            
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
    
    public static void underFive(int num, Scanner keyedInput){

        if (num == 5){
            
        }
        else if (num == 4){
            
        }
        else if (num == 3){
            
        }
        else if (num == 2){
            System.out.println("test");
        }
        else if (num == 1){
            System.out.println("test");
        }
        else{
            
            System.out.println("Enter a number between 1 and 11");
            desision(keyedInput);
        }
    }
    
    public static void bye(){
        System.out.println("Good Bye");
    }
}
