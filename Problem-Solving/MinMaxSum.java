import java.util.Scanner;

public class MinMaxSum
{
    static long[] sort(long array[]) /*Sorting the array*/
    {
        for(int i=0;i<5;i++) //Sorting the array.
        {
            for(int j=i+1;j<5;j++)
            {
                if(array[j]<array[i]) //Swapping.
                {
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        return array;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        long arr[] = new long[5];
        for(int i=0;i<5;i++)
        {
            arr[i] = input.nextLong();
        }
        arr = sort(arr);
        long min_sum,max_sum;
        min_sum = arr[0]+arr[1]+arr[2]+arr[3];
        max_sum = arr[1]+arr[2]+arr[3]+arr[4];
        System.out.println(min_sum + " " + max_sum);
    }
}
