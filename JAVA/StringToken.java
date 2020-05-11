import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.trim().equals(""))
        {
            System.out.println("0");
        }
        else
        {
            s = s.trim();
            String array[] = s.split("[  !,?._'@]+");
            System.out.println(array.length);
            for(String i: array)
            {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
