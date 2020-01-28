/*We use the integers a, b,n and  to create the following series:
(a+2(0).b),(a+2(0).b+2(1).b),…….,(a+2(0).b+2(1).b+….+2(n-1).b), where 2(x) represents 2 raised to the power x.
You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.*/

import java.util.*;
import java.io.*;

class Solution
{
    //The below method calculates the powers of any integer.
    int Power(int num, int pow)
    {
        int result=1;
        if(pow == 0)
        return 1;
        else
        {
            for(int i=1;i<=pow;i++)
            {
                result=result*num;
            }
            return result;
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        //Number of queries, q.
        int q = input.nextInt();
        //Array to store values of a.
        int a[] = new int[q];
        //Array to store values of b.
        int b[] = new int[q];
        //Array to store values of n, number of terms.
        int n[] = new int[q];

        //Taking inputs from the user.
        for(int i=0;i<q;i++)
        {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            n[i] = input.nextInt();
        }

        //Creating object of Solution class.
        Solution object = new Solution();

		//This loop determines that q series are printed.
        for(int i=0;i<q;i++)
        {
			//Variable to get the first term of series.
			int result1 = a[i] + object.Power(2,0)*b[i];
			//This loop determines that n terms are printed.
            for(int j=1;j<=n[i];j++)
            {
				//Printing the terms of the series.
                System.out.print((result1) + " ");
				//Subsequent terms of the series are calculated as below.
				result1 = result1 + object.Power(2,j)*b[i];
            }
			System.out.println("");
        }
    }
}
