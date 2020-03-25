import java.util.Scanner;

public class SolutionArrayDS
{
    //declaring method as static to make a call to it without reference variable.
    static void reverseArray(int array[])
    {
        //just printing the reverse array.
         for(int i=0;i<array.length;i++)
        {
            System.out.print(array[array.length-1-i] + " ");
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in); //object of scanner class to take input.
        int size; //to take array size.
        size = input.nextInt();
        //Declaring array of given size.
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            //Taking array input.
            arr[i] = input.nextInt();
        }
        reverseArray(arr);
    }
}
