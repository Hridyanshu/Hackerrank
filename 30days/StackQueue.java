import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    //declaring stack and queue.
    Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<>();

    void pushCharacter(char character)
    {
        //using pre-defined function.
        stack.push(character);
    }
    void enqueueCharacter(char character)
    {
        queue.add(character);
    }
    char popCharacter()
    {
        char topelement = stack.peek();
        stack.pop();
        return topelement;
    }
    char dequeueCharacter()
    {
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
