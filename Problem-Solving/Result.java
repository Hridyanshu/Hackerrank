import java.util.Scanner;

public class Result
{
    static long taumBday(int b, int w, int bc, int wc, int z)
    {
        long B = (long)b;
        long W = (long)w;
        long BC = (long)bc;
        long WC = (long)wc;
        long Z = (long)z;
        if((BC+Z)<WC)
            return (BC*(B+W) + Z*W);
        else if((WC+Z)<BC)
            return (WC*(B+W) + Z*B);
        else
            return (BC*B +WC*W);
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of test cases
        int t = input.nextInt();
        while(t>0)
        {
            //no of black gifts
            int b = input.nextInt();
            //no of white gifts
            int w = input.nextInt();
            //cost of one black gift
            int bc = input.nextInt();
            //cost of one white gift
            int wc = input.nextInt();
            //cost of converting black gift into white
            int z = input.nextInt();
            //total cost
            System.out.println((taumBday(b,w,bc,wc,z)));
            t--;
        }
    }
}
