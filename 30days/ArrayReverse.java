//Printing the reverse of an integer array.
import java.util.Scanner;

public class ArrayReverse
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        //declaring the array
        int array[] = new int[arraySize];
        //reading the array
        for(int i=0;i<arraySize;i++)
            array[i] = input.nextInt();
        //Printing the reverse of the array.
        for(int i=arraySize-1;i>=0;i--)
           System.out.print(array[i] + " ");
    }
}
