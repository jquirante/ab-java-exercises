/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises1;

/**
 *
 * @author justenquirante
 */
public class JavaExercises1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Calculate 45 + 78 / 87
        
        System.out.println("Exercise 1: Calculate 45 + 78 /87");
        double answer = 45 + (double) 78 / 87;
        System.out.println(answer);
        System.out.println("\n");
        // Assign variable A to int 8 and then change it to String “8”
        
        System.out.println("Exercise 2: Assign variable A to int 8 and then change it to String 8");
        
        int a = 8;
        String convertedInt = Integer.toString(a);
        System.out.println("The variable a is now - " + ((Object)convertedInt).getClass().getName());
        System.out.println("\n");
        // Assign Variable with your name and print string with replaced “My name is ” 
        
        System.out.println("Exercise 3: Assign Variable with your name and print string with replaced - My name is");
        String name = "Justen";
        System.out.println("My name is " + name);
        System.out.println("\n");
        //If else. - Assign int variable. If var is odd print “number is Odd”
        
        System.out.println("Exercise 4: If else. - Assign int variable. If var is odd print -- number is Odd");
        int odd = 3;
        
        if (odd % 2 != 0) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
        
        System.out.println("\n");
        
    }
    
}
