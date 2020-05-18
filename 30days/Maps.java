import java.util.Scanner;
import java.util.HashMap;

public class Maps
{
    public static void main(String args[])
    {
        //Creating the object of scanner class
        Scanner input = new Scanner(System.in);
        //Taking the number of entries as input.
        int n = input.nextInt();
        //declaring the map
        HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
        String name;
        int number;
        //receiving entries for map
        for(int i=0;i<n;i++)
        {
            name = input.next();
            number = input.nextInt();
            phonebook.put(name, number);
        }
        //since number of inputs is not defined so we will use hasNext()
        while(input.hasNext())
        {
            name = input.next();
            if(phonebook.containsKey(name))
                System.out.println(name + "=" + phonebook.get(name));
            else
                System.out.println("Not found");
        }
    }
}
