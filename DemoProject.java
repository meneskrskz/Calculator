package com.mycompany.demoproject;

import java.util.Scanner;

public class DemoProject {
    public static void main(String args[]) {
                
       Scanner input = new Scanner(System.in); 
       
       System.out.print("Enter the first number: ");
       double number1 = input.nextDouble();
       
       System.out.print("Enter the operator (+, -, *, /): ");
       String ope = input.next();
       
       System.out.print("Enter the second number: ");
       double number2 = input.nextDouble();
       
       
       switch (ope) {
           
       case "+":
           double sum = number1 + number2;
           System.out.println("Result: " + sum);
           break;
           
       case "-":
           double sub = number1 - number2;
           System.out.println("Result: " + sub);
           break;
               
       case "*":
           double mul = number1 * number2;
           System.out.println("Result: " + mul);
           break;
               
       case "/":    
           double div = number1 / number2;
           System.out.println("Result: " + div);
           break;
               
       default:
           System.out.println("Invalid operator. Please enter +, -, *, or /.");
           break;
       } 
       
    }
}    