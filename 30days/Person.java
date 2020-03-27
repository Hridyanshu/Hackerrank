import java.io.*;
import java.util.*;

public class Person
{
    int age;
    Person(int initialAge)
    {
	//Just assigns the non-negative value of age to the instanve variable.
        if(initialAge>0)
            age = initialAge;
        else
        {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
    }
    void yearPasses()
    {
	//This method behaves as if one year has passed.
        this.age++;
    }
    void amIOld()
    {
	//Are you old enough? Let's check!!
        if(this.age<13)
            System.out.println("You are young.");
        else if(this.age>=13 && this.age<18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
