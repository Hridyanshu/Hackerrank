//Operators problem

import java.util.Scanner;

public class Operators
{
    public static void main(String args[])
    {
        //Scanner class object.
        Scanner input = new Scanner(System.in);
        //Taking inputs.
        double mealcost = input.nextDouble();
        int tip = input.nextInt();
        int tax = input.nextInt();
        input.close();
        //Calculating total tip
        //Writing 100 as 100.0 to get the double value of the division.
        double total_tip = (tip/100.0)*mealcost;
        //calculating total tax
        double total_tax = (tax/100.0)*mealcost;
        //calculating total cost
        //Adding 1/2 to help rounding-off to nearest integer value.
        double totalcost = mealcost + total_tip + total_tax + 0.5;
        //Printing the result
        System.out.println((int)totalcost);
    }
}
