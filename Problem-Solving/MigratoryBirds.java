import java.util.Scanner;

public class MigratoryBirds
{
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //array to store frequency of types 1,2,3,4,5
        int frequencyType[] = {0,0,0,0,0};
        //taking the number of birds sighted as input
        int n = input.nextInt();
        //declaring the array to store the types of sighted birds
        int birdType[] = new int[n];
        //taking the array as input
        for(int i=0;i<n;i++)
        {
            birdType[i] = input.nextInt();
            frequencyType[birdType[i]-1]++;
        }
        int max = frequencyType[0],max_index = 0;
        for(int i=1;i<5;i++)
        {
            if(frequencyType[i]>max)
            {
                max = frequencyType[i];
                max_index = i;
            }
        }
        System.out.println(max_index+1);
    }
}

