import java.util.Scanner;
public class Solution
{
        public static void main(String args[])
        {
                //Taking input.
                Scanner input = new Scanner(System.in);
                int N = input.nextInt();

                //Output part.
                for(int i=1;i<=10;i++)
                {
                        System.out.println(N + " x " + i + " = " + N*i);
                }
        }
}
