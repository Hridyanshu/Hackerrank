import java.util.Scanner;

public class AngryTeacher
{
    static boolean classCancelled(int array[], int k)
    {
        int count = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<=0)
                count++;
        }
        if(count>=k)
            return false;
        return true;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //number of test cases
        int t = input.nextInt();
        for(int i=0;i<t;i++)
        {
            //number of students
            int n = input.nextInt();
            //threshold
            int k = input.nextInt();
            //arrival times of students
            int arrivalTimes[] = new int[n];
            for(int j=0;j<n;j++)
                arrivalTimes[j] = input.nextInt();
            if(classCancelled(arrivalTimes, k))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        input.close();
    }
}
