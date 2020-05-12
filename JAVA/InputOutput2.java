import java.util.Scanner;

public class Solution
{
    public static void main(String args[])
    {
        //All the variables used are declared here.

        int num;
        double num2;
        String str;

        //Values are taken as input.

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        num2 = input.nextDouble();
        /*Now when the user presses enter after giving num2 as input, a newline character will be available in the buffer to be read as input by the next command*/
        str = input.nextLine();
        /*To read the actual string, we have to take input again and overwrite the previous one.*/
        str = input.nextLine();

        //Values are printed in this section.

        System.out.println("String: " + str);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num);
    }
}
