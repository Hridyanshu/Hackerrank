/*Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Link:https://www.hackerrank.com/challenges/time-conversion/problem*/

import java.util.Scanner;
public class TimeConversion
{
    public static void main(String args[])
    {
        String time; //time in 12-hr format.
        Scanner input = new Scanner(System.in);
        time = input.nextLine();
		input.close();
		int first_char = Integer.parseInt(String.valueOf(time.charAt(0))); //Char to int conversion.
		int second_char = Integer.parseInt(String.valueOf(time.charAt(1)));
		int first_two_char = first_char*10 + second_char; //Getting hh as single integer.
		
		char second_last_char = time.charAt(time.length()-2);
				
			//Conversion to 24-hour format.	
			if(second_last_char=='P')
			{
				if(first_two_char!=12)
					System.out.print(first_two_char+12);
				else
					System.out.print(first_two_char);
			}
			if(second_last_char=='A')
			{
				if(first_two_char==12)
					System.out.print("00");
				else
				{
					System.out.print(first_char);
					System.out.print(second_char);
				}
			}
			
			//Displaying the final time.
			for(int i=2;i<time.length()-2;i++)
				System.out.print(time.charAt(i));
	}
}
