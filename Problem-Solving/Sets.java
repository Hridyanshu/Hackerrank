import java.util.Scanner;

public class Sets
{
    static int getTotal(int a[], int b[])
    {
        int count = 0;
        int j,k;
        for(int i=a[a.length-1];i<=b[0];i+=a[a.length-1])
        {
            for(j=0;j<b.length;j++)
            {
                if(b[j]%i == 0)
                    continue;
                else
                    break;
            }
            if(j==b.length)
            {
                for(k=0;k<a.length;k++)
                {
                    if(i%a[k] == 0)
                        continue;
                    else
                        break;
                }
                if(k == a.length)
                    count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //reading the sizes of arrays
        int size_a = input.nextInt();
        int size_b = input.nextInt();
        //declaring the arrays
        int a[] = new int[size_a];
        int b[] = new int[size_b];
        //reading the arrays
        for(int i=0;i<size_a;i++)
        {
            a[i] = input.nextInt();
        }
        for(int i=0;i<size_b;i++)
        {
            b[i] = input.nextInt();
        }
        //calling the function to get the required count
        System.out.println(getTotal(a,b));
    }
}
