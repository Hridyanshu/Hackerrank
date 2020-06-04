import java.util.Scanner;

public class StringMatchHackerrank
{
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String array[] = new String[n];
        input.nextLine();
        for(int i = 0;i<n;i++)
        {
            array[i] = input.nextLine();
        }
        String str = "hackerrank";
        int j;
        for(int i = 0;i<n;i++)
        {
            j = 0;
            for(int k = 0;k<array[i].length();k++)
            {
                if(array[i].charAt(k) == str.charAt(j))
                    j++;
                if(j==10)
                    break;
            }
            if(j == 10)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
