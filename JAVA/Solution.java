import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int B, H;
static boolean flag; //can be true or false.
static{
    //static initializer block.
    Scanner input = new Scanner(System.in);
    B = input.nextInt();
    H = input.nextInt();
    flag = (B>0) && (H>0);
    if(!flag) //in case flag values false.
        System.out.println("java.lang.Exception: Breadth and height must be positive");
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
