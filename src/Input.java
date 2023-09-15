//(c) A+ Computer Science
//www.apluscompsci.com
//NAME - Blaise Martinez
//DATE - 09/14/2023
//PURPOSE - Input Lab 1

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables of at least 2 different types
        String test;
        double doubleOne, doubleTwo;


        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();


        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();


        //add in input for all variables
        System.out.print("Enter a word :: ");
        test = keyboard.next();

        System.out.print("Enter a Double :: ");
        doubleOne = keyboard.nextDouble();

        System.out.print("Enter a Double :: ");
        doubleTwo = keyboard.nextDouble();

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("String one = " + test );
        System.out.println("double one = " + doubleOne );
        System.out.println("double two = " + doubleTwo );

        //add output for all variables


    }
}