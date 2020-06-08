import java.util.Scanner;

public class PrimalityCheck
{
    public static void main (String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //reading the number of test cases as input
        int n = input.nextInt();
        int temp;
        //reading the inputs
        outer: for(int i=0;i<n;i++)
        {
            temp = input.nextInt();
            for(int j=2;j<=java.lang.Math.sqrt(temp);j++)
            {
                if(temp%j == 0)
                {
                    System.out.println("Not prime");
                    continue outer;
                }
            }
            if(temp==1)
            {
                System.out.println("Not prime");
                continue;
            }
            System.out.println("Prime");
        }
    }
}
