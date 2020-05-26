import java.util.Scanner;

class Solution
{
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        int i = 1;
        while(input.hasNext())
        {
            //hasNext() returns true unless the input is finished
            //displaying first line
            System.out.println(i + " " + input.nextLine());
            i++;
        }
    }
}
