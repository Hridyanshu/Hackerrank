import java.util.Scanner;
import java.text.DecimalFormat;

public class OutputFormat
{
    public static void main(String args[])
    {
        //Declaring three integers and three strings in the form of array.
        int num[];
        num = new int[3];
        String str[];
        str = new String[3];

        //Creating a reference of Scanner class in order to take inputs.
        Scanner input = new Scanner(System.in);

        //Taking inputs.
        for(int i=0;i<3;i++)
        {
            str[i] = input.next();
            num[i] = input.nextInt();
        }

        //Output part.
        System.out.println("================================");
        DecimalFormat ft = new DecimalFormat("000");
        //The above statement will convert the integer in a string of length three.
        for(int i=0;i<3;i++)
        {
            System.out.printf("%-14s %s\n",str[i],ft.format(num[i]));
            /*-14 will left align the string and limit it till 14 characters, one character is then utilised by space character thus total 15 characters. Then, integer value will be printed as a string of three characters, thus satisfying the required output.*/
        }
        System.out.println("================================");
    }
}
