import java.util.Scanner;

public class Weird
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //reading the value of n
        int n = input.nextInt();
        if(n%2 != 0)
            System.out.println("Weird");
        else if(n%2 == 0)
        {
            if(2<=n && n<=5)
                System.out.println("Not Weird");
            else if(6<=n && n<=20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        }
    }
}
