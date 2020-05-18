import java.util.Scanner;

public class Hourglass
{
    public static void main(String args[])
    {

        //object of scanner class
        Scanner input = new Scanner(System.in);
        //Declaring array
        int array[][] = new int[6][6];
        //taking elements as input
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
                array[i][j] = input.nextInt();
        }
        int temp = Integer.MIN_VALUE, sum;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                //calculating sum of one hourglass
                sum = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
                if(sum>=temp)
                    temp = sum;
            }
        }
        System.out.println(temp);
    }
}
