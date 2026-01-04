/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: PrintBagels.java
    Date: Nov 27, 2023
 Purpose: Java TEST, I was so worried~~
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

import java.util.Scanner;

public class PrintBagels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //variables
        int numBagels;
        int numBagelsPrinted=1;
        
        //get number of bagels
        System.out.println("Please enter number of bagels > 0, -1 to quit");
        numBagels = input.nextInt();
        
        //print out 
        while(numBagels!=-1){
            if (numBagels==-1){
                System.exit(0);//exit program
            } else{
                while(numBagels>=numBagelsPrinted){
                    if(numBagelsPrinted%12==0){
                        System.out.print("O ");
                        System.out.println();
                        numBagelsPrinted++;
                    } else {
                        System.out.print("O ");
                        numBagelsPrinted++;
                    }
                }
                numBagelsPrinted = 1;//returns bagels printed value to 1 because if it is not it will have a few errors~
            }
            System.out.println();
            System.out.println("Please enter number of bagels > 0, -1 to quit");
            numBagels = input.nextInt();
        }
    }

}