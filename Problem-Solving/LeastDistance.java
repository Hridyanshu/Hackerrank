import java.util.Scanner;

public class LeastDistance
{
    static int minimumDistances(int a[])
    {
        int temp;
        int leastDistance = a.length+1;
        for(int i=0;i<a.length;i++)
        {
            temp = a[i];
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]==temp)
                {
                    if(leastDistance>(j-i))
                        leastDistance = j-i;
                    break;
                }
            }
        }
        if(leastDistance==a.length+1)
            return -1;
        else
            return leastDistance;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //array size
        int n = input.nextInt();
        //array
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = input.nextInt();
        input.close();
        System.out.println(minimumDistances(a));
    }
}
