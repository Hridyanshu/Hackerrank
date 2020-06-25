import java.util.Scanner;

public class KeySearch
{
    static int indexOfKey(int arr[], int V)
    {
        int low = 0;
        int high = arr.length-1;
        int mid = (low + high)/2;
        while(low <= high)
        {
            if(V == arr[mid])
                break;
            else if(V>arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
            mid = (low + high)/2;
        }
        return mid;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //value to search for
        int V = input.nextInt();
        //array size
        int n = input.nextInt();
        //array
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = input.nextInt();
        input.close();
        System.out.println(indexOfKey(arr,V));
    }
}
