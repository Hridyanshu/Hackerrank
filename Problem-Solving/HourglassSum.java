import java.util.Scanner;

public class HourglassSum
{
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //declring the array
        int array[][] = new int[6][6];
        //taking the array
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        //assigning least possible value to temp
        //this is because temp is to be compared with sum
        //and sum can also be negative
        int sum = 0,temp = Integer.MIN_VALUE;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                //sum of one hourglass
                sum = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
                if(temp>sum)
                    sum = temp;
                temp = sum;
            }
        }
        System.out.println(sum);
    }
}
