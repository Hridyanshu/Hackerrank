import java.util.*;

public class ParenthesisChecker
{
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        char array[];
        outer: while(input.hasNext())
        {
            String str = input.next();
            //converting the string into char array.
            array = str.toCharArray();
            //creating a Stack
            Stack<Character> charStack = new Stack<Character>();
            int i;
            for(i=0;i<array.length;i++)
            {
                if(array[i]=='('||array[i]=='{'||array[i]=='[')
                {
                    charStack.push(array[i]);
                    continue;
                }
                else
                {
                    try
                    {
                        char temp = charStack.peek();
                        char temp2 = array[i];
                        if(temp=='(' && temp2==')' || temp=='{' && temp2=='}' || temp=='[' && temp2==']')
                        {
                            charStack.pop();
                            continue;
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println("false");
                        continue outer;
                    }
                }
            }
            if(charStack.empty())
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
