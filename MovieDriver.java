package MovieDriverPackage;
import java.util.Scanner;
public class MovieDriver 
{

	public static void main(String[] args) 
	{
		String answer;
		do
		{
			Scanner kb = new Scanner(System.in);
			Movie movie = new Movie();
			System.out.println("Enter the title of a movie: ");
			String movieTitle = kb.nextLine();
			movie.setTitle(movieTitle);
			System.out.println("Enter the movie's rating: ");
			String movieRating = kb.nextLine();
			movie.setRating(movieRating);
			System.out.println("Enter the number of tickes sold at the theater: ");
			int movieTicketSold = kb.nextInt();
			movie.setSoldTickets(movieTicketSold);
			System.out.println(movie.toString());
			kb.nextLine();
			System.out.println("DO you want to enter another(y or n)");
			answer = kb.nextLine();
		}while (answer.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
	}

}
