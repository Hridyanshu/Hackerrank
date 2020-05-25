import java.util.Scanner;

public class KangarooJumps
{
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //receiving inputs
        //x1 and x2 are starting points for the kangaroos
        //vi and v2 are the jump distances of the kangaroos
        int x1 = input.nextInt();
        int v1 = input.nextInt();
        int x2 = input.nextInt();
        int v2 = input.nextInt();
        //checking the conditions
        if(x2>x1 && v2>=v1)
        {
            System.out.println("NO");
            System.exit(0);
        }
        else
        {
            while(x1 != x2)
            {
                x1 = x1 + v1;
                x2 = x2 + v2;
                if(x1>x2) //first kangaroo crosses the second kangaroo
                {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
            System.out.println("YES");
        }
    }
}
