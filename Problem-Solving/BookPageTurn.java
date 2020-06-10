import java.util.Scanner;

public class BookPageTurn
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //taking number of pages
        int n = input.nextInt();
        //destination page
        int p = input.nextInt();
        //printing number of pages that should be turned
        System.out.println(java.lang.Math.min(p/2, (n%2==0&&p%2!=0) ? ((n-p+1)/2):(n-p)/2));
    }
}
