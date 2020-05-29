import java.util.Scanner;

public class Birthday
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //reading the size of the array
        int size = input.nextInt();
        //declaring the array
        int array[] = new int[size];
        //taking array as input
        for(int i=0;i<size;i++)
        {
            array[i] = input.nextInt();
        }
        //reading the values of d and m
        int d = input.nextInt();
        int m = input.nextInt();
        //count takes the count of number of possible ways
        int count = 0;
        //it takes the sum of the bar
        int sum = 0;
        //the size of the bar must be m.
        for(int i=0;(i+m)<=size;i++)
        {
            sum = 0;
            for(int j=i;j<(i+m);j++)
            {
                sum = sum + array[j];
            }
            if(sum == d)
                count++;
        }
        System.out.println(count);
    }
}
