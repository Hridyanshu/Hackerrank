import java.util.Scanner;

public class SpecialProblem
{
    static int workbook(int n, int k, int arr[])
    {
        int specialCount = 0;
        int pageNumber = 0;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            pageNumber++;
            temp = 0;
            for(int j=1;j<=arr[i];j++)
            {
                temp++; 
                if(j==pageNumber)
                    specialCount++;
                if(temp==k && j<arr[i])
                {
                    temp = 0;
                    pageNumber++;
                }
            }
        }
        return specialCount;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //no of chapters
        int n = input.nextInt();
        //max problems per page
        int k = input.nextInt();
        //array
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = input.nextInt();
        input.close();
        System.out.println(workbook(n,k,arr));
    }
}
