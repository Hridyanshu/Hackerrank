import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taking no of strings as input.
        int stringCount = input.nextInt();
        input.nextLine(); //Clearing the input buffer.
        //Declaring an array of strings.
        String array[] = new String[stringCount];
        float temp;
        for(int i=0;i<stringCount;i++)
        {
            //Taking the strings as input.
            array[i] = input.nextLine();
        }
        String temp1; //to store even position characters.
        String temp2; //to store odd position characters.
        //Printing the desired output.
        for(int j=0;j<stringCount;j++)
        {
            temp1 = "";
            temp2 = "";
            for(int k=0;k<array[j].length();k++)
            {
                if(k%2==0)
                    temp1 = temp1 + array[j].charAt(k);
                else
                    temp2 = temp2 + array[j].charAt(k);
            }
            System.out.println(temp1 + " " + temp2);
        }
    }
}
