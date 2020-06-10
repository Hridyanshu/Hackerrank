import java.util.Scanner;

public class SockPair
{
    static int[] sort(int array[])
    {
        //bubble sort
        for(int i=0;i<array.length;i++)
        {
            for(int j=1;j<(array.length-i);j++)
            {
                if(array[j-1] > array[j])
                {
                    //swap elements
                    array[j] = array[j] + array[j-1];
                    array[j-1] = array[j] - array[j-1];
                    array[j] = array[j] - array[j-1];
                }
            }
        }
        return array;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //no of socks
        int sock[] = new int[n];
        for(int i=0;i<n;i++)
            sock[i] = input.nextInt();
        //sorting the array
        sort(sock);
        int temp = sock[0];
        int tempcount = 1;
        int count = 0;
        for(int i=1;i<sock.length;i++)
        {
            if(sock[i] == temp)
                tempcount++;
            else if(sock[i] != temp)
            {
                count = count + tempcount/2;
                tempcount = 1;
                temp = sock[i];
            }
        }
        count = count + tempcount/2;
        System.out.println(count);
    }
}
