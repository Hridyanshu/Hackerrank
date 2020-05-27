import java.util.*;

public class ListAddDel
{
    public static void main(String args[])
    {
        //object of scanner class
        Scanner input = new Scanner(System.in);
        //declaring the list
        List<Integer> list = new ArrayList<Integer>();
        //n specifies the number of inputs
        int n = input.nextInt();
        int temp; //for storing the element temporarily
        //reading the elements of list
        for(int i=0;i<n;i++)
        {
            temp = input.nextInt();
            list.add(temp);
        }
        int queries = input.nextInt(); //it stores the number of queries.
        String s; //stores the type of query, insert/delete
        int index;
        for(int i=0;i<queries;i++)
        {
            s = input.next();
            if(s.equals("Insert"))
            {
                index = input.nextInt();
                int value = input.nextInt();
                //inserting the value
                list.add(index, value);
            }
            else if(s.equals("Delete"))
            {
                index = input.nextInt();
                //removing the element
                list.remove(index);
            }
        }
        //printling the final list
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
    }
}
