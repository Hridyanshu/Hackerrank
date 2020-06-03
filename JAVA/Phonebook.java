import java.util.*;

public class Phonebook
{
    public static void main(String args[])
    {
        //Object of Scanner class
        Scanner input = new Scanner(System.in);
        //taking the number of entries as input
        int n = input.nextInt();
        //declaring the Map
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
        String name;
        int number;
        //reading the entries of the phonebook
        for(int i=0;i<n;i++)
        {
            input.nextLine();
            name = input.nextLine();
            number = input.nextInt();
            phonebook.put(name, number);
        }
        //reading the queries
        String query;
        input.nextLine();
        while(input.hasNext())
        {
            query = input.nextLine();
            if(phonebook.containsKey(query))
                System.out.println(phonebook.get(query));
            else
                System.out.println("Not found");
        }
    }
}
