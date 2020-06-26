import java.util.Scanner;

public class IceCreamParlor
{
    static int[] icecreamparlor(int m, int cost[])
    {
        int temp = m - cost[0];
        int index[] = new int[2];
        index[0] = 1;
        for(int i=1;i<cost.length;i++)
        {
            if((temp-cost[i])==0)
            {
                index[1] = i+1;
                break;
            }
            if(i==(cost.length-1))
            {
                i = index[0];
                index[0] = i+1;
                temp = m - cost[i];
            }
        }
        if(index[0]>index[1])
        {
            index[0] = index[0] + index[1];
            index[1] = index[0] - index[1];
            index[0] = index[0] - index[1];
        }
        return index;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of test cases
        int t = input.nextInt();
        while(t>0)
        {
            //money they have
            int m = input.nextInt();
            //no of flavors
            int n = input.nextInt();
            //flavors cost
            int cost[] = new int[n];
            for(int i=0;i<n;i++)
                cost[i] = input.nextInt();
            for(int i: icecreamparlor(m,cost))
                System.out.print(i + " ");
            System.out.println();
            t--;
        }
    }
}
