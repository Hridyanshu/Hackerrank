import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here

class MyRegex
{
    //pattern 1 denotes any number from 0 to 255.
    String pattern1 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = pattern1 + "\\." + pattern1 + "\\." + pattern1 + "\\." + pattern1;
}
