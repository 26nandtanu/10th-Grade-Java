
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 26nandtanu
 */
public class SquareFeet {

    // method
    public static void main(String[] args) {

        // Variable Declaration
        double squareFeet;
        double squareMeter;

        // input setup
        Scanner input = new Scanner(System.in);

        // prompt and input gathering
        System.out.println("Hello, welcome to square feet to square meter calculator.");
        System.out.println("Enter square feet:");
        squareFeet = input.nextDouble();

        // calculate
        squareMeter = squareFeet / 10.7639;

        // present
        System.out.println("---------------------------------------");
        System.out.println("Square Meter = " + squareMeter);
    }
}
