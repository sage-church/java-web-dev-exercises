package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles you've driven in your car:");

        int milesDriven = input.nextInt();

        System.out.println("Enter the number of gallons of gas that have been consumed in this process:");

        int gallonsOfGasUsed = input.nextInt();

        int milesPerGallon = milesDriven / gallonsOfGasUsed;

        System.out.println("You achieved a stat of " + milesPerGallon + "mpg.");

    }

}
