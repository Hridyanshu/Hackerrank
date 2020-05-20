import java.util.*;
import java.io.*;

//Write your code here
class Calculator
{
    int power(int p, int q) throws Exception
    {
        if(p<0 || q<0) //checking if n or p in negative or not
            throw new Exception("n and p should be non-negative");
        
        int result = 1;
        for(int i=0;i<q;i++)
        {
            result = result*p;
        }
        return result;
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
