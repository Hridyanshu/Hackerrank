import java.util.Scanner;

public class Anagram {

    static char[] sort(char array[])
    {
        char temp;
        //sorting the array using bubble sort
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    //swapping
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        //converting the strings to lower case
        a = a.toLowerCase();
        b = b.toLowerCase();
        //converting strings to character arrays
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        if(arr1.length!=arr2.length)
            return false;
        //sorting the arrays
        arr1 = sort(arr1);
        arr2 = sort(arr2);
        int i;
        for(i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
                break;
        }
        if(i==arr1.length)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
