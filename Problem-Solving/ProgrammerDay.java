import java.util.Scanner;

public class ProgrammerDay
{
    static String programmerDay(int year)
    {
        //this method return the 256th day of the specified year.
        //256th day in the year will definitely lie in september.
        //now, if we exclude february, then till August, number of days would be
        int days_7months = 215;
        //calculating number of days in february for the respective years
        int days_feb;
        if(year == 1918)
            days_feb = 15;
        else
        {
            if(year%4 != 0)
            days_feb = 28;
            else
            {
                if(year<1918)
                days_feb = 29;
                else
                {   
                    int temp = (year%100 == 0) ? 28 : 29;
                    days_feb = (year%400 == 0) ? 29 : temp;
                }
            }
        }
        String dd = Integer.toString(256 - (days_7months + days_feb));
        return (dd + ".09." + Integer.toString(year));
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //reading the year as input
        int year = input.nextInt();
        //printing the final output
        System.out.println(programmerDay(year));
    }
}
