import java.util.Scanner;

public class RecordBreak
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //taking the size of scores array as input
        int size = input.nextInt();
        //declaring the array
        int scores[] = new int[size];
        //reading the array
        for(int i=0;i<size;i++)
        {
            scores[i] = input.nextInt();
        }
        /**maxcount and leastcount stores the number of times the max score and the least score record is broken**/
        int maxcount = 0;
        int leastcount = 0;
        int max = scores[0], min = scores[0];
        for(int i=1;i<size;i++)
        {
            if(scores[i]>max)
            {
                max = scores[i];
                maxcount++;
            }
            else if(scores[i]<min)
            {
                min = scores[i];
                leastcount++;
            }
        }
        System.out.println(maxcount + " " + leastcount);
    }
}
