import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
//declaring the HashSet
HashSet<String> pair = new HashSet<String>();
for(int i=0;i<t;i++)
{
    //just adding the pair
    pair.add("(" + pair_left[i] + "," + pair_right[i] + ")");
    //pair will be automatically dropped if it is duplicate.
    //Thus, no. of unique pairs is the size of the HashSet.
    System.out.println(pair.size());
}

   }
}
