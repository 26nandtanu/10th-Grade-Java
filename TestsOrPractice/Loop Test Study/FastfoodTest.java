/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: FastfoodTest.java
    Date: Nov 16, 2023
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

import java.util.Scanner;

public class FastfoodTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        int item;
        int hotDog = 0;
        int soda = 0;
        int hamburger = 0;

        //get input
        System.out.println("""
                           1 = HotDog $1
                           2 = Soda .50
                           3 = Hamburger $2
                           Please enter choice, -1 to quit""");
        item = input.nextInt();

        //calculate and present
        while (true) {
            if (item == -1) {
                break;
            } else if (item == 1) {
                hotDog++;
            } else if (item == 2) {
                soda++;
            } else if (item == 3) {
                hamburger++;
            } else {
                System.out.println("Not an Option~!");
            }
            System.out.println("""
                           1 = HotDog $1
                           2 = Soda .50
                           3 = Hamburger $2
                           Please enter choice, -1 to quit""");
            item = input.nextInt();
        }
        System.out.println("Hot Dogs: " + hotDog);
        System.out.println("Soda: " + soda);
        System.out.println("Hamburger: " + hamburger);
        int hotDogCost = hotDog;
        double sodaCost = soda * 0.5;
        int hamburgerCost = hamburger * 2;
        double cost = hotDogCost + sodaCost + hamburgerCost;
        System.out.println("Total Cost: " + cost);

    }

}
