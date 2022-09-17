import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Movie a = new Movie();
		
		String title, rating, loop;
		int sold;
		
do {
		System.out.println("Enter name of a movie: ");
		title = input.nextLine();
		
		a.setTitle(title);
		
		System.out.println("Enter the rating of the movie: ");
		rating = input.nextLine();
		
		a.setRating(rating);
		
		System.out.println("Enter number of tickets sold for this movie: ");
		sold = input.nextInt();
		
		a.setSoldTickets(sold);
		
		System.out.println(a.toString());
		
		System.out.println("Do you want to enter another (y or n)");
		input.nextLine();
		loop = input.next();
		input.nextLine();
	} 
while(loop.equalsIgnoreCase("y"));

	if(loop.equalsIgnoreCase("n"))
	{
		System.out.println("GoodBye");
	}
		input.close();
	}
	
}
