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
        int num = 0;
        
        //Scanner Object
        Scanner keyedInput = new Scanner(System.in);
        
        //Loop to run game
        while(play == 1){
            desision(keyedInput,num);
            
            if (num > 5){
                aboveFive(num);
            }
            else if(num <= 5){
                
            underFive(num);

            }
            
        }
        bye();
    }
    
    public static int desision(Scanner keyedInput,int num){        
        //Output 11 choices of things to do
        System.out.println("Enter a the number corresponding with the action you would like to do");
        
        System.out.println("1... (question)");
        
        System.out.println("2... (question)");
        
        System.out.println("3... (question)");
        
        System.out.println("4... (question)");
        
        System.out.println("5... (question)");
        
        System.out.println("6... (question)");
        
        System.out.println("7... (question)");
        
        System.out.println("8... (question)");
        
        System.out.println("9... (question)");
        
        System.out.println("10... (question)");
        
        System.out.println("11... (question)");
        
        
        
        num = keyedInput.nextInt();

        return (num);
    }
    
    public static void aboveFive(int num){
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
    }
    
    public static void underFive(int num){
        
    }
    
    public static void bye(){
        System.out.println("Good Bye");
    }
}
