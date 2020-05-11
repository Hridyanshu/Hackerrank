import java.util.*;

public class ExceptionHandling1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        try //exception can occur in code inside this block.
        {
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
