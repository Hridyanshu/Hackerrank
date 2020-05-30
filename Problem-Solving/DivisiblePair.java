import java.util.Scanner;

public class DivisiblePair
{
    static int countMethod(int array[], int k)
    {
        int count = 0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if((array[i] + array[j])%k==0)
                    count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //reading the array size
        int n = input.nextInt();
        //reading the value of k
        int k = input.nextInt();
        //declaring the array
        int array[] = new int[n];
        //reading the array
        for(int i=0;i<n;i++)
        {
            array[i] = input.nextInt();
        }
        //calling the function
        System.out.println(countMethod(array, k));
    }
}
