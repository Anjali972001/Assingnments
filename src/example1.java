import java.sql.SQLOutput;

public class example1 {
    public static void main(String[] args) {
        try
        {
            int a = 50/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println((e));
        }
        System.out.println("Then rest of the program will execute.");
    }
}/* java.lang.ArithmeticException: / by zero
   Then rest of the program will execute.*/
