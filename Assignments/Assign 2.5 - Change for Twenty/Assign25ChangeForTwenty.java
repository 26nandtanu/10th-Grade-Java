
import java.util.Scanner;

/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: Assign25ChangeForTwenty.java
    Date: Oct 3, 2023
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/
public class Assign25ChangeForTwenty {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        double change;
        double moneyInserted = 20;
        double cost;
        double remainderTens;
        double tens;
        double remainderFives;
        double fives;
        double remainderOnes;
        double ones;
        double remainderQuarters;
        double quarters;
        double remainderDimes;
        double dimes;
        double remainderNickels;
        double nickels;
        double pennies;

        //import
        System.out.println("Cost: ");
        cost = input.nextDouble();

        //calculations
        change = moneyInserted - cost;
        change = change * 100; //move the decimal over 2 places
        change = (int) (change + .5); //add .5 and then chop off decimal
        change = change / 100; //move the decimal place back
        tens = change / 10;
        tens = tens * 100; //move the decimal over 2 places
        tens = (int) (tens + .5); //add .5 and then chop off decimal
        tens = tens / 100; //move the decimal place back
        remainderTens = change - Math.floor(tens) * 10;
        fives = remainderTens / 5;
        fives = fives * 100; //move the decimal over 2 places
        fives = (int) (fives + .5); //add .5 and then chop off decimal
        fives = fives / 100; //move the decimal place back
        remainderFives = change - Math.floor(tens) * 10 - Math.floor(fives) * 5;
        ones = remainderFives / 1;
        ones = ones * 100; //move the decimal over 2 places
        ones = (int) (ones + .5); //add .5 and then chop off decimal
        ones = ones / 100; //move the decimal place back
        remainderOnes = change - Math.floor(tens) * 10 - Math.floor(fives) * 5 - Math.floor(ones);
        quarters = remainderOnes / 0.25;
        quarters = quarters * 100; //move the decimal over 2 places
        quarters = (int) (quarters + .5); //add .5 and then chop off decimal
        quarters = quarters / 100; //move the decimal place back
        remainderQuarters = change - Math.floor(tens) * 10 - Math.floor(fives) * 5 - Math.floor(ones) - Math.floor(quarters) * 0.25;
        dimes = remainderQuarters / 0.1;
        dimes = dimes * 100; //move the decimal over 2 places
        dimes = (int) (dimes + .5); //add .5 and then chop off decimal
        dimes = dimes / 100; //move the decimal place back
        remainderDimes = change - Math.floor(tens) * 10 - Math.floor(fives) * 5 - Math.floor(ones) - Math.floor(quarters) * 0.25 - Math.floor(dimes) * 0.1;
        nickels = remainderDimes / 0.05;
        nickels = nickels * 100; //move the decimal over 2 places
        nickels = (int) (nickels + .5); //add .5 and then chop off decimal
        nickels = nickels / 100; //move the decimal place back
        remainderNickels = change - Math.floor(tens) * 10 - Math.floor(fives) * 5 - Math.floor(ones) - Math.floor(quarters) * 0.25 - Math.floor(dimes) * 0.1 - Math.floor(nickels) * 0.05;
        pennies = remainderNickels / 0.01;
        pennies = pennies * 100; //move the decimal over 2 places
        pennies = (int) (pennies + .5); //add .5 and then chop off decimal
        pennies = pennies / 100; //move the decimal place back

        //present
        System.out.println("Change: " + change);
        System.out.println("Tens: " + Math.floor(tens));
        System.out.println("Fives: " + Math.floor(fives));
        System.out.println("Ones: " + Math.floor(ones));
        System.out.println("Quarters: " + Math.floor(quarters));
        System.out.println("Dimes: " + Math.floor(dimes));
        System.out.println("Nickels: " + Math.floor(nickels));
        System.out.println("Pennies: " + Math.floor(pennies));
        System.out.println("--------------------------------------------");
    }

}
