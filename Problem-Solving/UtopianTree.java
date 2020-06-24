import java.util.Scanner;

public class UtopianTree
{
    static int utopianTree(int n)
    {
        int height = 1;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0) //spring
                height = height * 2;
            else if(i%2==0) //summer
                height++;
        }
        return height;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of test cases
        int t = input.nextInt();
        while(t>0)
        {
            //no of growth cycles
            int n = input.nextInt();
            //final height
            System.out.println(utopianTree(n));
            t--;
        }
    }
}
