import java.util.Scanner;

public class PrisonerCandy
{
    static int saveThePrisoner(int n, int m, int s)
    {

        //sweets distributed till the last chair starting from s
        int sweetsTemp = (n-s) + 1;
        //sweets left
        int rem = (sweetsTemp<m) ? (m-sweetsTemp) : (s+m-1);
        //person receiving the last candy
        int chairNo = (rem%n==0) ? n : (rem%n);
        return chairNo;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of test cases
        int t = input.nextInt();
        while(t>0)
        {
            //no of prisoners
            int n = input.nextInt();
            //no of sweets
            int m = input.nextInt();
            //starting position
            int s = input.nextInt();
            System.out.println(saveThePrisoner(n, m, s));
            t--;
        }
    }
}
