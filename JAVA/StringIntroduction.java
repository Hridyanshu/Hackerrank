import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {    
        Scanner sc= new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //Printing the sum of lengths of both strings.
        System.out.println(A.length() + B.length());
        //lexographically comparing A and B.
        int result = A.compareTo(B);
        if(result>0) //A is greater than B
            System.out.println("Yes");
        else
            System.out.println("No");
        A = (A.substring(0,1)).toUpperCase() + A.substring(1);
        B = (B.substring(0,1)).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
