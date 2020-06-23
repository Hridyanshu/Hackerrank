import java.util.Scanner;

public class ViralAdvertisement
{
    static int viralAdvertising(int n)
    {
        int recepients = 5;
        int liked = 0;
        int cummulative = 0;
        for(int i=1;i<=n;i++)
        {
            liked = recepients/2;
            cummulative = cummulative + liked;
            recepients = liked * 3;
        }
        return cummulative;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of days
        int n = input.nextInt();
        input.close();
        System.out.println(viralAdvertising(n));
    }
}
