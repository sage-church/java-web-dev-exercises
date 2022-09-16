package org.launchcode.java.studios.areaOfCircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");

        double radius;

        try{

            radius = input.nextDouble();

            while (radius < 0) {
                System.out.println("Input must be a number greater than or equal to 0.");
                System.out.println("Enter a radius:");
                radius = input.nextDouble();
            }

        } catch(InputMismatchException e) {

            System.out.println("Input must be a number greater than or equal to 0.");
            return;

        }



        double area = Circle.getArea(radius);

        System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");

    }

}
