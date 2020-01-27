/*Given an integer,n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird*/

import java.util.Scanner;
public class Solution
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
