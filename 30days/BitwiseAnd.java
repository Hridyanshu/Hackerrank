import java.util.Scanner;

public class BitwiseAnd
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of test cases
        int number = input.nextInt();
        int n;
        int k;
        int max;
        int temp;
        for(int i=0;i<number;i++)
        {
            max = 0;
            n = input.nextInt();
            k = input.nextInt();
            for(int p=1;p<n;p++)
            {
                for(int q=p+1;q<=n;q++)
                {
                    temp = p&q;
                    if(temp<k && max<temp)
                        max = temp;
                }
            }
            System.out.println(max);
        }
        input.close();
    }
}
