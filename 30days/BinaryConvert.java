import java.util.Scanner;

public class BinaryConvert
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        long binaryNum = 0;
        while(num>0)
        {
            //this block is giving us binary equivalent in reverse order.
            binaryNum = binaryNum*10 + num%2;
            num = num/2;
        }
        int count = 0, temp = 0;
        while(binaryNum>0)
        {
        /* this block counts the consecutive 1's and comparing the two successive counts */
            if(binaryNum%10 == 1)
            {
                count++;
                binaryNum = binaryNum/10;
                continue;
            }
            if(temp>count)
            {
                count = temp;
            }
            else if(binaryNum%10 == 0)
            {
                temp = count;
                count = 0;
                binaryNum = binaryNum/10;
                continue;
            }
        }
        if(temp>count)
        {
               count = temp;
        }
        System.out.println(count);
    }
}

