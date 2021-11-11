import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int a,b,res;
        Scanner input = new Scanner(System.in);
        try
        {
            a=input.nextInt();
            b=input.nextInt();
            res=a/b;
            System.out.println(res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot be divided with zero .");
        }
        catch(InputMismatchException e){
            System.out.println("Only integer number excepted .");
        }
    }

    }// if 12 and 12 given input the 1 will be output.

