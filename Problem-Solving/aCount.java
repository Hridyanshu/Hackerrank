import java.util.Scanner;

public class aCount
{
    static long repeatedString(String s, long n)
    {
        long check = 0;
        int i=0;
        long count = 0;
        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'a')
                count++;
        }
        long div = n/s.length();
        long reminder = n%s.length();
        count = div*count;
        for(i=0; i<reminder; i++)
        {
            if(s.charAt(i) == 'a')
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //string
        String s = input.nextLine();
        //no of characters to consider
        long n = input.nextLong();
        if(s.contains("a"))
            System.out.println(repeatedString(s, n));
        else
            System.out.println("0");
    }
}
