package randomNumberGuesser;

import java.util.Random;
import java.util.Scanner;
 
public class RNG 
{
	
	// this method below generates random number
	
		public static int rand()
		
		{
			Random ran = new Random();
			
			//creates random object
			
			int nxt = ran.nextInt(100);
			
			//generates integer
			
			int correctGuess = nxt;
			return correctGuess;
		}
		
		// below is main
		
		public static void main(String[] args)
		
		{
			
			do
			{
				// below prints out header
				
					System.out.println("=================================================================");
					System.out.println("Header: Random number guesser ");
					System.out.println("=================================================================");
					int y = -1;
					y++;
					
					// y is number of attempts it starts with -1 to display 0 attempts before anything
					
					System.out.println("Number of guesses is: " + y);
					
					// below calls method random and sets a random number into correctGuess variable so the random number doesn't keep changing unless starting over
					
				int correctGuess = rand();
				System.out.print("Enter your first guess between 0-99\n");
				
				// display/ask for and get guess number from user
				Scanner kb = new Scanner (System.in);
				int guess = kb.nextInt();
				
				// validity variable is just a name and variable holder to set how many times the while loop should repeat. thousand is more than enough
				
				int validity=0;
				
				// below makes sure entry is between 0-99.
				
				while ((guess < 0)||(guess > 99)&& (validity <1000))
				{
					System.out.println("Invalid entry please enter again between 0-99!");
					guess = kb.nextInt();
				}
				
				// below congratulates user if they guessed correct answer
				
					if (guess == correctGuess)
						{
							System.out.println("Congratulations you have guessed the number correctly!!");
							System.out.println("Do you want to try again? (yes or no)");
						}
					else
						{	
							int attempt = 1;
							int lowerGuess = 0 , higherGuess = 100;	
							
							// begining of if statment
							if (guess < correctGuess)
								{
								
								// if user didn't guess correct set guess as lowerGuess or higherGuess depending on the correctGuess
								
									lowerGuess = guess;
									y++;
									System.out.println("Number of guesses is: " + y);
									System.out.println("your guess is too low");
									System.out.println("Enter your next guess between: " + lowerGuess + " " + "and: " + higherGuess);
									guess = kb.nextInt();
									
									// below says if guess is not between lower guess and higher guess display to retry
									
									if (guess < lowerGuess || guess > higherGuess)
									{
										int exitVariable = 0;
										do
										{
										
											System.out.println("Invalid entry please enter your next guess between: " + lowerGuess + " " + "and: " + higherGuess);
											guess = kb.nextInt();
										}while (guess < lowerGuess || guess > higherGuess && exitVariable < 1000);
										
										// repeat the above while guess is lower or higher than the variables lowerGuess and higherGuess.
										
									}
									else if (guess == correctGuess)
									{
										System.out.println("Congratulations you have guessed the number correctly!!");
										System.out.println("Do you want to try again? (yes or no)");
									}
								}
							
							// begining of else if statment then repeat the above except set the higher guess to variable higherGUess			
							else if (guess > correctGuess)
							{
								higherGuess = guess;
								y++;
								System.out.println("Number of guesses is: " + y);
								System.out.println("your guess is too high");
								System.out.println("Enter your next guess between: " + lowerGuess + " " + "and: " + higherGuess);
								guess = kb.nextInt();
								if (guess < lowerGuess || guess > higherGuess)
								{
									int exitVariable = 0;
									do
									{
									
										System.out.println("Invalid entry please enter your next guess between: " + lowerGuess + " " + "and: " + higherGuess);
										guess = kb.nextInt();
									}while (guess < lowerGuess || guess > higherGuess && exitVariable < 1000);
								}
								else if (guess == correctGuess)
								{
									System.out.println("Congratulations you have guessed the number correctly!!");
									System.out.println("Do you want to try again? (yes or no)");
								}
							}
							
							// below repeat the process until the correct guess is found by the user while giving hints
									
							do    
							{
					
								if(guess == correctGuess)
								{
									System.out.println("Congratulations you have guessed the number correctly!!");
									System.out.println("Do you want to try again? (yes or no)");
								}
								else if (guess < correctGuess)
								{
									lowerGuess = guess;
									y++;
									System.out.println("Number of guesses is: " + y);
									System.out.println("your guess is too low");
									System.out.println("Enter your next guess between: " + lowerGuess + " " + "and: " + higherGuess);
									guess = kb.nextInt();
									if (guess < lowerGuess || guess > higherGuess)
									{
										int exitVariable = 0;
										do
										{
										
											System.out.println("Invalid entry please enter your next guess between: " + lowerGuess + " " + "and: " + higherGuess);
											guess = kb.nextInt();
										}while (guess < lowerGuess || guess > higherGuess && exitVariable < 1000);
									}
									else if (guess == correctGuess)
									{
										System.out.println("Congratulations you have guessed the number correctly!!");
										System.out.println("Do you want to try again? (yes or no)");
									}
								}
											
								else if (guess > correctGuess)
								{
									higherGuess = guess;
									y++;
									System.out.println("Number of guesses is: " + y);
									System.out.println("your guess is too high");
									System.out.println("Enter your next guess between: " + lowerGuess + " " + "and: " + higherGuess);
									guess = kb.nextInt();
									if (guess < lowerGuess || guess > higherGuess)
									{
										int exitVariable = 0;
										do
										{
										
											System.out.println("Invalid entry please enter your next guess between: " + lowerGuess + " " + "and: " + higherGuess);
											guess = kb.nextInt();
										}while (guess < lowerGuess || guess > higherGuess && exitVariable < 1000);
									}
									else if (guess == correctGuess)
									{
										System.out.println("Congratulations you have guessed the number correctly!!");
										System.out.println("Do you want to try again? (yes or no)");
									}
								}
							
							}  while ((guess != correctGuess)&&(1000 >= attempt ));
						}
				
					// below calls the boolean method under to decide to play again or not
			} while (againOrBye() == true);	
			if (againOrBye() == false)
				{
					System.out.println("Thank you for playing with the programer, Orion Belete's game!!");
				}
			
		}
		
		// this method sets true if the user replies yes and false if the user replies no.
		
		public static boolean againOrBye()
		
		{
			Scanner kb2 = new Scanner (System.in);
			String answer = kb2.nextLine();
			if ((answer.equals("yes"))||(answer.equals("YES")))
			{
				return true;
			}
			else if ((answer.equals("no"))||(answer.equals("NO")))
			{
			System.out.println("Thank you for playing with the programmer, Orion Belete's game!!");
			System.exit(0);
			return false;
			
			
			}
			else
				
				// below confirms if the user replied with the proper answer (yes or no)
				do
				{
					{
						System.out.println("Invalid answer please type yes or no!");
						return false;
					}
				}while (!((answer.equals("no"))||(answer.equals("NO")))&&(!((answer.equals("yes"))||(answer.equals("YES")))));
				
				
		}
}
