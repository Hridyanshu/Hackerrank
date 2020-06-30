import java.util.Scanner;

public class Kaprekar
{
    static void kaprekarNumbers(int p, int q)
    {
        String number;
        String square;
        String right;
        String left;
        int sum;
        int count = 0;
        for(int i=p;i<=q;i++)
        {
            number = Integer.toString(i);
            square = Long.toString((long)i*i);
            left = square.substring(0,square.length()-number.length());
            right = square.substring(square.length()-number.length(),square.length());
            if (left.equals(""))
                left = "0";
            sum = Integer.parseInt(left) + Integer.parseInt(right);
            if(sum == i)
            {
                System.out.print(i + " ");
                count = 1;
            }
        }
        if(count!=1)
            System.out.println("INVALID RANGE");
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //lower limit
        int p = input.nextInt();
        //upperlimit
        int q = input.nextInt();
        input.close();
        kaprekarNumbers(p,q);
    }
}
