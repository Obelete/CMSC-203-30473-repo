/*
 * Class: CMSC203 
 * Instructor: Dr.Ahmed Tarek
 * Description: Assignment 1 (WIFI Diagnosis)
 * Due: 2/09/2021
 * Date: 2/05/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: __Orion Belete________
*/

package assignment1;
import java.util.Scanner;
public class WifiDiagnosis 
{

	public static void main(String[] args) //main method
	{
		System.out.println("If your internet connection is having problems this diagnosis might be helpful!");
		//display above text
		System.out.println("Reboot the computer and try to connect!");
		//display above text
		System.out.println("Did that fix the problem? please enter yes or no");
		//display above text
		String answer1;
		// declare variable to hold input
		Scanner kb = new Scanner (System.in);
		answer1 = kb.next();
		// The above scans input
		if (answer1.equals("yes")  || answer1.equals("YES"))
		{
			System.out.println("Thank you for using this program!");
			System.exit(0);
		}
		else if(answer1.equals("no") || answer1.equals("NO"))
		{
			System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
		}
		else
		{
			while(!(answer1.equals("yes") || answer1.equals("YES")  || answer1.equals("no") || answer1.equals("NO")))
				{
					System.out.println("Invalid entry please enter yes or no");
					answer1 = kb.next();
					if (answer1.equals("yes")  || answer1.equals("YES"))
					{
						System.out.println("Thank you for using this program!");
						System.exit(0);
					}
					else if(answer1.equals("no") || answer1.equals("NO"))
					{
						System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
					}
					
				}
		}
		// (line 32-36) if entered input is yes or YES problem is solved so exit
		// (line 37-40)if entered input is no or NO display the above text make sure...
		// (line 41-57)if entered input is not yes, YES, no or NO keep asking to try again using a while loop.
		System.out.println("Did that fix the problem? please enter yes or no");
		answer1 = kb.next();
		if (answer1.equals("yes")  || answer1.equals("YES"))
		{
			System.out.println("Thank you for using this program!");
			System.exit(0);
		}
		else if(answer1.equals("no") || answer1.equals("NO"))
		{
			System.out.println("Move the computer closer to the router and try to connect");
		}
		else
		{
			while(!(answer1.equals("yes") || answer1.equals("YES")  || answer1.equals("no") || answer1.equals("NO")))
			{
				System.out.println("Invalid entry please enter yes or no");
				answer1 = kb.next();
				if (answer1.equals("yes")  || answer1.equals("YES"))
				{
					System.out.println("Thank you for using this program!");
					System.exit(0);
				}
				else if(answer1.equals("no") || answer1.equals("NO"))
				{
					System.out.println("Move the computer closer to the router and try to connect");
				}
				
			}
		}
		// (line 64-68)if entered input is yes or YES problem is solved so exit
		// (line 69-72)if entered input is no or NO display the above text move the computer closer...
		// (line 73-89)if entered input is not yes, YES, no or NO keep asking to try again.
		System.out.println("Did that fix the problem? please enter yes or no");
		answer1 = kb.next();
		if (answer1.equals("yes")  || answer1.equals("YES"))
		{
			System.out.println("Thank you for using this program!");
			System.exit(0);
		}
		else if(answer1.equals("no") || answer1.equals("NO"))
		{
			System.out.println("Contact your ISP");
		}
		else
		{
			while(!(answer1.equals("yes") || answer1.equals("YES")  || answer1.equals("no") || answer1.equals("NO")))
			{
				System.out.println("Invalid entry please enter yes or no");
				answer1 = kb.next();
				if (answer1.equals("yes")  || answer1.equals("YES"))
				{
					System.out.println("Thank you for using this program!");
					System.exit(0);
				}
				else if(answer1.equals("no") || answer1.equals("NO"))
				{
					System.out.println("Contact your ISP");
					System.exit(0);
				}
				
			}
		}
		// (line 96-100)if entered input is yes or YES problem is solved so exit
		// (line 101-104)if entered input is no or NO display the above text contact your ISP.
		// (line 105-122)if entered input is not yes, YES, no or NO keep asking to try again.
		kb.close();
	}

}
