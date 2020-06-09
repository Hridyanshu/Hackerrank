import java.util.*;
import java.util.regex.*;

public class MailIdSort
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String exp = "[a-z.]+@gmail\\.com";
        Pattern p = Pattern.compile(exp);
        ArrayList<String> names = new ArrayList<String>();
        for(int i = 0;i<n;i++)
        {
            String input[] = scanner.nextLine().split(" ");
            String name = input[0];
            String mailid = input[1];
            Matcher m = p.matcher(mailid);
            if(m.matches())
                names.add(name);
        }
        scanner.close();
        Collections.sort(names);
        for(String s : names)
            System.out.println(s);
    }
}
