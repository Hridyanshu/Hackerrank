import java.util.Scanner;

public class HighlightArea
{
    static int area(int height[], String word)
    {
        int maxHeight = height[(int)(word.charAt(0))-97];
        int temp;
        for(int i=1;i<word.length();i++)
        {
            temp = height[(int)(word.charAt(i))-97];
            if(temp > maxHeight)
                maxHeight = temp;
        }
        return maxHeight * word.length();
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //declaring array
        int height[] = new int[26];
        for(int i=0;i<26;i++)
            height[i] = input.nextInt();
        input.nextLine();
        String word = input.nextLine();
        input.close();
        System.out.println(area(height, word));
    }
}
