import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String temp;
        for(int i=0;i+k<=s.length();i++)
        {
            temp = s.substring(i,i+k);
            if(largest.compareTo(temp)<0)
                largest = temp;
            else if(smallest.compareTo(temp)>0)
                smallest = temp;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
