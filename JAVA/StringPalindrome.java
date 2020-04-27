import java.io.*;
import java.util.*;

public class StringPalindrome
{
    public static void main(String[] args)
    {    
        Scanner sc = new Scanner(System.in);
        //taking the input string.
        String A=sc.next();
        sc.close();
        //storing the string in stringbuilder.
        StringBuilder s = new StringBuilder(A);
        //reversing the stringBuilder and converting it into string. 
        String revA = s.reverse().toString();
        //checking palindrome
        if(A.equals(revA))
            System.out.println("Yes");
        else
            System.out.print("No");
    }
}
