import java.util.Scanner;

public class Sorting
{
    static int totalswaps = 0;
    static int swaps = 0;
    static int[] sort(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            swaps = 0;
            for(int j=0;j<array.length-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    //swapping
                    array[j] = array[j] + array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j] - array[j+1];
                    swaps++;
                }
            }
            totalswaps = totalswaps + swaps;
            if(swaps == 0)
            {
                //array is sorted
                break;
            }
        }
        return array;
    }
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //taking array size
        int size = input.nextInt();
        //declaring array
        int array[] = new int[size];
        //receiving the array
        for(int i=0;i<size;i++)
        {
            array[i] = input.nextInt();
        }
        //sorting the array
        array = sort(array);
        System.out.println("Array is sorted in " + totalswaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[size-1]);
    }
}
