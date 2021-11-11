/* ASSIGNMENT -1(EXCEPTION HANDLING)
Handle exception in number
        Problem statement:
        Get the input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output).
        Sample input and output 1:
        Enter an integer: 12
        The square value is 144
        The work has been done successfully


        Sample input and output 2:
        Enter an integer: Java
        Entered input is not a valid format for an integer.*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try
        {
            int a = input.nextInt();
            int res = a*a;
            System.out.println(res);
            System.out.println("The work has been done successfully .");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Entered input is not a valid format for an integer .");
        }
    }


}
