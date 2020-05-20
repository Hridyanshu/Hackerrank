import java.util.Scanner;

public class IntegerString
{
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //reading the string
        String str = input.nextLine();
        //converting string to integer
        try
        {
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Bad String");
        }
    }
}
