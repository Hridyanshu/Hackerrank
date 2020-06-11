import java.util.Scanner;

public class MoneySpend
{
    static int maxPrice(int budget, int kPrice[], int uPrice[])
    {
        int tempmax;
        int max = -1;
        for(int i=0;i<kPrice.length;i++)
        {
            for(int j=0;j<uPrice.length;j++)
            {
                tempmax = kPrice[i] + uPrice[j];
                if(tempmax<=budget && tempmax>max)
                    max = tempmax;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //budget
        int budget = input.nextInt();
        //number of keyboards
        int n = input.nextInt();
        //number of USB
        int m = input.nextInt();
        //declaring the arrays to store the prices of keyboards and USB
        int keyboardPrice[] = new int[n];
        int usbPrice[] = new int[m];
        //entries of the arrays
        for(int i=0;i<n;i++)
            keyboardPrice[i] = input.nextInt();
        for(int i=0;i<m;i++)
            usbPrice[i] = input.nextInt();
        System.out.println(maxPrice(budget, keyboardPrice, usbPrice));
    }
}
