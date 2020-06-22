import java.util.Scanner;

public class ArrayRotate
{
    static int[] rotLeft(int array[], int d)
    {
        int length = array.length;
        int newArray[] = new int[length];
        System.arraycopy(array, 0 , newArray, 0 , length);
        while(d!=0)
        {
            for(int i=0;i<array.length-1;i++)
                newArray[i] = array[i+1];
            newArray[length-1] = array[0];
            System.arraycopy(newArray, 0 , array, 0 , length);
            d--;
        }
        return newArray;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //size of array
        int n = input.nextInt();
        //no of rotations
        int d = input.nextInt();
        //declaring the array
        int a[] = new int[n];
        //reading the array
        for(int i=0;i<n;i++)
            a[i] = input.nextInt();
        input.close();
        for(int i: rotLeft(a, d))
            System.out.print(i + " ");
    }
}
