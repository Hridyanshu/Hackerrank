import java.util.Scanner;

class Date
{
    //This class stores the date.
    public int dd, mm , yyyy;
    Date(int dd, int mm, int yyyy)
    {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }
}
public class LibraryFine
{
    public static void main(String args[])
    {
        int fine = 0;
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //receiving the actual return date.
        int tempDd = input.nextInt();
        int tempMm = input.nextInt();
        int tempYyyy = input.nextInt();
        Date actualReturn = new Date(tempDd, tempMm, tempYyyy);
        //receiving the expected return date.
        tempDd = input.nextInt();
        tempMm = input.nextInt();
        tempYyyy = input.nextInt();
        Date expectedReturn = new Date(tempDd, tempMm, tempYyyy);
        if(actualReturn.yyyy == expectedReturn.yyyy)
        {
            if(actualReturn.mm == expectedReturn.mm)
            {
                if(actualReturn.dd > expectedReturn.dd)
                    fine = 15*(actualReturn.dd - expectedReturn.dd);
            }
            else
                fine = 500*(actualReturn.mm - expectedReturn.mm);
        }
        else if(actualReturn.yyyy < expectedReturn.yyyy)
            fine = 0;
        else
            fine = 10000;
        if(fine<0)
            fine = 0;
        System.out.println(fine);
    }
}
