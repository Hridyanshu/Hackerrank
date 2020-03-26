//Hello, World problem.

import java.util.Scanner;

public class HelloWorld
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        System.out.println("Hello, World.\n" + str);
    }
}
