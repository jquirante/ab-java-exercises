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
        
        // Calculate 20 + -3 * 5 / 8
        
        double a = 20 + (double) (-3 * 5) / 8;
        System.out.println("Calculate 20 + -3 * 5 / 8 \n" + a);
        
        // Convert Farenheight to Celsius
        
        int temperature = 87;
        double convertedTemp = (temperature - 32) * (double) 5/9;
        System.out.println("Convert Farenheight to Celsius: \n" + convertedTemp);
        
        // If Else - Print 'Number is odd'
        
        int oddNumber = 3;
        
        if (oddNumber % 2 != 0) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is not Odd");
        }
        
    }
     
}
