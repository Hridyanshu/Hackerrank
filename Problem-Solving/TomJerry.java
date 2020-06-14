import java.util.Scanner;

public class TomJerry
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of queries
        int q = input.nextInt();
        for(int i=0;i<q;i++)
        {
            //position of Cat A
            int x = input.nextInt();
            //position of Cat B
            int y = input.nextInt();
            //position of Mouse C
            int z = input.nextInt();
            //distance between Cat A and Mouse C
            int distance1 = java.lang.Math.abs(x-z);
            //distance between Cat B and Mouse C
            int distance2 = java.lang.Math.abs(y-z);
            String result = (distance1<distance2) ? "Cat A" : (distance1 == distance2 ? "Mouse C" : "Cat B");
            System.out.println(result);
        }
    }
}
