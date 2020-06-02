import java.util.Scanner;

public class Appetite
{
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //taking the number of items ordered
        int n = input.nextInt();
        //taking the index of item that Anna didn't eat
        int k = input.nextInt();
        //declaring the bills array
        int bill[] = new int[n];
        //reading the array bill[]
        for(int i=0;i<n;i++)
        {
            bill[i] = input.nextInt();
        }
        //taking the amount of money that Anna contributed to the bill
        int bill_Anna = input.nextInt();
        //sum is the actual amount that anna should pay
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if(i!=k)
                sum = sum + bill[i];
        }
        sum = sum/2;
        if(sum == bill_Anna)
            System.out.println("Bon Appetit");
        else
            System.out.println(bill_Anna - sum);
    }
}
