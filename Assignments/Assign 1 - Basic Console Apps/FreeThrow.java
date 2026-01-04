/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author 26nandtanu
 */
public class FreeThrow {

//method
    public static void main(String[] args) {

        //variable
        int freeThrow1;
        int freeThrow2;
        int freeThrow3;
        int freeThrow4;
        int freeThrow5;
        int freeThrows;
        double percentageDecimal;
        double percentage;

        //input setting
        Scanner input = new Scanner(System.in);

        //get values 
        System.out.println("Hello, I am a free throw percent finder.");
        System.out.println("Please enter your Free Throw 1 result, 1 if made and 0 if missed.");
        freeThrow1 = input.nextInt();
        System.out.println("Please enter your Free Throw 2 result, 1 if made and 0 if missed.");
        freeThrow2 = input.nextInt();
        System.out.println("Please enter your Free Throw 3 result, 1 if made and 0 if missed.");
        freeThrow3 = input.nextInt();
        System.out.println("Please enter your Free Throw 4 result, 1 if made and 0 if missed.");
        freeThrow4 = input.nextInt();
        System.out.println("Please enter your Free Throw 5 result, 1 if made and 0 if missed.");
        freeThrow5 = input.nextInt();

        //calculate
        freeThrows = freeThrow1+freeThrow2+freeThrow3+freeThrow4+freeThrow5;
        percentageDecimal = freeThrows/5.0;
        percentage = percentageDecimal*100;

        //present
        System.out.println("------------------------------------------");
        System.out.println("Your Free Throw Success Percentage is " + percentage + "%");
    }
}
