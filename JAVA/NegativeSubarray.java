import java.util.Scanner;

public class NegativeSubarray
{
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //size of the array
        int size = input.nextInt();
        //declaring the array
        int array[] = new int[size];
        //reading the array
        for(int i=0;i<size;i++)
        {
            array[i] = input.nextInt();
        }
        //count stores the number of negative subarrays
        //sum stores the sum of each subarray
        int sum, count = 0;
        for(int i=0;i<size;i++)
        {
            sum = 0;
            //getting all possible subarrays and their sum
            for(int j=i;j<size;j++)
            {
                sum = sum + array[j];
                if(sum<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}

