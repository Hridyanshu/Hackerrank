import java.util.Scanner;

public class PatternStaircase
{
    public static void staircase(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j > (n-i))
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //reading the value of n
        int n = input.nextInt();
        //calling the function
        staircase(n);
    }
}
