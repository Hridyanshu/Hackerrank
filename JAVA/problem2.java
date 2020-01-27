/*In this challenge, you must read three integers from stdin and then print them to stdout. Each integer must be printed on a new line.*/
import java.util.Scanner;


public class Solution
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
       
	/*An object "input" of scanner class is created to take inputs.*/
        
	int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
	System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
