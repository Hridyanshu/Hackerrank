import java.util.Scanner;
public class ArraySum
{
    static int Sum(int array[]) /*Calculating sum of array elements.*/
    {
        int sum = 0;
        for(int i=0;i<array.length;i++) /*array.length gives the size of the array.*/
        {
            sum = sum + array[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        int arr[]; //Declaring the array.
        int size; //size of the array.
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println(Sum(arr));
    }
}
