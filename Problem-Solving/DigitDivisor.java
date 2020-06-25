import java.util.Scanner;

public class DigitDivisor
{
    static int findDigits(int n)
    {
        int temp = n;
        int digit;
        int divisorCount = 0;
        while(temp>0)
        {
            digit = temp%10; //extracting last digit of temp
            if(digit!=0) //div by 0 not possible
            {
                if(n%digit==0) //checking for divisor
                    divisorCount++;
            }
            temp = temp/10; //reducing one digit in temp
        }
        return divisorCount;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of test cases
        int t = input.nextInt();
        while(t>0)
        {
            //number
            int n = input.nextInt();
            System.out.println(findDigits(n));
            t--;
        }
    }
}
