package org.example;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Converter convert = new Converter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcomes to the conversion program!");
        System.out.print("Enter ounces: ");
        int inputOz = scanner.nextInt();
        System.out.println("Got your ounces: " + inputOz);

        System.out.println("Converting to pounds and ounces: " + convert.toPoundsAndOunces(inputOz));
        System.out.println("Converting to pounds: " + convert.toPounds(inputOz));
        System.out.println("Program finished! cya!");

        scanner.close();
    }
    
}