import java.util.Scanner;
public class Weird
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2==0)
        {
            if(num>=2&&num<=5)
            {
                System.out.println("Not Weird");
            }
            else if(num>=6&&num<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
        else
        {
            System.out.println("Weird");
        }
    }
}
