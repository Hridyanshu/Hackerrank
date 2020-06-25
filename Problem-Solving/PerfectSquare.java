import java.util.Scanner;
import java.lang.Math;

public class PerfectSquare
{
    static int squares(int a, int b)
    {
        int start = (int)Math.sqrt(a);
        if(a != (start*start))
            start = start + 1;
        int count = 0;
        for(int i=start;i*i<=b;i++)
            count++;
        return count;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of test cases
        int t = input.nextInt();
        while(t>0)
        {
            //lower limit
            int a = input.nextInt();
            //upper limit
            int b = input.nextInt();
            System.out.println(squares(a,b));
            t--;
        }
    }
}
