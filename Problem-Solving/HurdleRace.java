import java.util.Scanner;

public class HurdleRace
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //number of hurdles
        int n = input.nextInt();
        //max height Dan can jump
        int k = input.nextInt();
        int heights[] = new int[n];
        int maxHeight = 0; //max height of hurdle
        for(int i=0;i<n;i++)
        {
            heights[i] = input.nextInt();
            if(heights[i]>maxHeight)
                maxHeight = heights[i];
        }
        if(maxHeight>k)
            System.out.println(maxHeight - k);
        else
            System.out.println("0");
    }
}
