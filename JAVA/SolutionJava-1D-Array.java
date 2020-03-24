import java.util.*;

public class SolutionJava-1D-Array {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n]; //Declaring the array.
        for(int i=0;i<a.length;i++) //Taking array as input.
            a[i] = scan.nextInt();
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
