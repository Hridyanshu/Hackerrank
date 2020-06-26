import java.util.Scanner;

public class LibraryFine
{
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2)
    {
        int fine = 0;
        if(y1<y2)
            return fine;
        else if(y1==y2)
        {
            if(m1>m2)
                fine = 500*(m1-m2);
            else if(m1==m2)
            {
                if(d1>d2)
                    fine = 15*(d1-d2); 
            }
            else
                return fine;
        }
        else
            fine = 10000;
        return fine;
    }
    public static void main(String args[])
    {
        //object of Scanner class
        Scanner input = new Scanner(System.in);
        //return date, month and year
        int d1 = input.nextInt();
        int m1 = input.nextInt();
        int y1 = input.nextInt();
        //due date, month and year
        int d2 = input.nextInt();
        int m2 = input.nextInt();
        int y2 = input.nextInt();
        input.close();
        System.out.println(libraryFine(d1,m1,y1,d2,m2,y2));
    }
}
