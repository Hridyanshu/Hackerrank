import java.util.Scanner;

public class EnergyCount
{
    static int jumpingOnClouds(int c[], int k)
    {
        int energy = 100;
        int length = c.length;
        int index = 1;
        for(int i=0;index!=0;)
        {
            index = (i+k)%length;
            energy--;
            if(c[index]==1)
                energy = energy-2;
            i = index;
        }
        return energy;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of clouds
        int n = input.nextInt();
        //length of one jump
        int k = input.nextInt();
        //cloud array
        int c[] = new int[n];
        for(int i=0;i<n;i++)
            c[i] = input.nextInt();
        input.close();
        System.out.println(jumpingOnClouds(c, k));
    }
}
