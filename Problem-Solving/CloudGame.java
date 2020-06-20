import java.util.Scanner;

public class CloudGame
{
    static int jumpingOnClouds(int array[])
    {
        int i = 0;
        int jumpCount = 0;
        while(i<(array.length-2))
        {
            if(array[i+2]==0)
                i = i + 2;
            else if(array[i+1] == 0)
                i++;
            jumpCount++;
        }
        if(i!=(array.length-1))
            jumpCount++;
        return jumpCount;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //number of clouds
        int n = input.nextInt();
        int cloudsafety[] = new int[n];
        for(int i=0;i<n;i++)
            cloudsafety[i] = input.nextInt();
        System.out.println(jumpingOnClouds(cloudsafety));
    }
}
