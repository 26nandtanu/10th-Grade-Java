/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tanus
 */

import java.util.Scanner;

public class OneOfAKind {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //variables
        int a = 0;
        int b = 0;
        int c = 0;
        
        //get inputs
        System.out.println("Enter 1st Number:");
        a = input.nextInt();
        System.out.println("Enter 2nd Number:");
        b = input.nextInt();
        System.out.println("Enter 3rd Number:");
        c = input.nextInt();
        
        //calculate and present
        if(a==b && b==c){
            System.out.println("Three of a Kind");
        } else if (a==b || b==c || a==c){
            System.out.println("Two of a Kind");
        } else {
            System.out.println("None of a Kind");
        }
    }
}
