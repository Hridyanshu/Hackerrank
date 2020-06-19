import java.util.Scanner;

public class BeautifulDays
{
    static int revDifference(int num)
    {
        int temp = num;
        int reverseNum = 0;
        while(temp>0)
        {
            reverseNum = (reverseNum*10) + temp%10;
            temp = temp/10;
        }
        return java.lang.Math.abs(num - reverseNum);
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        int i = input.nextInt(); //starting number
        int j = input.nextInt(); //ending number
        int k = input.nextInt(); //beautiful number
        int beautifulDaysCount = 0;
        for(int x=i;x<=j;x++)
        {
            if(revDifference(x)%k == 0)
                beautifulDaysCount++;
        }
        System.out.println(beautifulDaysCount);
    }
}
