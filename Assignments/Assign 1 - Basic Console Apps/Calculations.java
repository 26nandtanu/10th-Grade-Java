/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 26nandtanu
 */
public class Calculations {
//method

    public static void main(String[] args) {

        //variable
        double num1;
        double num2;
        double num3;
        double sum;
        double product;
        double formula;
        double largestNumber1;
        double largestNumber2;
        double largestNumber;

        //input set up
        Scanner input = new Scanner(System.in);

        //get values
        System.out.println("Hello! Please enter the first value into the Number Analyzer:");
        num1 = input.nextDouble();
        System.out.println("Second Value:");
        num2 = input.nextDouble();
        System.out.println("Third Value:");
        num3 = input.nextDouble();

        //calculate
        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;
        formula = 3 * num1 + 2 / num2 + num3 - 5;
        largestNumber1 = Math.max(num1, num2);
        largestNumber2 = Math.max(num2, num3);
        largestNumber = Math.max(largestNumber1, largestNumber2);

        //present
        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
        System.out.println("After putting the values through the formula, the result is " + formula);
        System.out.println("The largest number is " + largestNumber);
    }
}
