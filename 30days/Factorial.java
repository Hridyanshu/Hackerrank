import java.util.Scanner;

public class Factorial
{
    static int factorial(int n)
    {
        if(n==0||n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }
    public static void main(String args[])
    {
        //creating object of scanner class to take input.
        Scanner input = new Scanner(System.in);
        //taking the number
        int num = input.nextInt();
        System.out.println(factorial(num));
    }
}
