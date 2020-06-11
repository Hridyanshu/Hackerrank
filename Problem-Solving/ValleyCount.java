import java.util.Scanner;

public class ValleyCount
{
    static int valleyCount(int n, String s)
    {
        int count = 0;
        int altitude = 0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == 'U')
                altitude++;
            else
                altitude--;
            if(i>0 && altitude == 0)
            {
                if(s.charAt(i)=='U')
                    count++;
            }
        }
        if(s.charAt(n-1)=='D' && altitude == -1)
            count++;
        return count;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        System.out.println(valleyCount(n,s));
    }
}
