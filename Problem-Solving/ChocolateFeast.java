import java.util.Scanner;

public class ChocolateFeast
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of test cases
        int t = input.nextInt();
        while(t>0)
        {
            //amount Bobby has
            int n = input.nextInt();
            //cost of one chocolate
            int c = input.nextInt();
            //wrappers reqd to take one free chocolate
            int m = input.nextInt();
            int count = n/c;
            int wrappers = count;
            while(wrappers>=m)
            {
                count = count + wrappers/m;
                wrappers = wrappers%m + wrappers/m;
            }
            System.out.println(count);
            t--;
        }
    }
}
