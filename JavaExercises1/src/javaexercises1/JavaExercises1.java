/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises1;

import java.util.Scanner;

/**
 *
 * @author justenquirante
 */
public class JavaExercises1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
//        int value = scanner.nextInt();
//        
//        calcFibonacci(value);
        
//        int primeTestVal = scanner.nextInt();
//        
//        System.out.println(primeNumber(primeTestVal));
        
      
        
    }
    
    public static void calcFibonacci(int value) {
        System.out.println("Running");
        
        int total = 0;
        int initVal = 0;
        int nextVal = 1;
        for (int x = 0; x < value; x++) {    
            total += initVal;
            initVal = nextVal;
            nextVal = total;
            
            System.out.println("Total is " + total);
        
        }
    }
    
    public static boolean primeNumber(int value) {
        System.out.println("Calculate prime");
        
        boolean isPrime = true;
        if (value == 0 || value == 1) {
           isPrime = false;
        } else {
           for (int x = 2; x < value; x++) {
               if (value % x == 0) {
                   isPrime = false;
               } 
           }
        
        }
        
        return isPrime;
                
    
    }
    
    public static String countString(String word) {
    
        System.out.println("Count String Running");
    }
}
