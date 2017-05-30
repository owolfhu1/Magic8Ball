import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int randomNumber;
		String question;
		String[] anwsers = {
				 "It is certain"
				,"It is decidedly so"
				,"Without a doubt"
				,"Yes definitely"
				,"You may rely on it"
				,"As I see it, yes"
				,"Most likely"
				,"Outlook good"
				,"Yes"
				,"Signs point to yes"
				,"Reply hazy try again"
				,"Ask again later"
				,"Better not tell you now"
				,"Cannot predict now"
				,"Concentrate and ask again"
				,"Don't count on it"
				,"My reply is no"
				,"My sources say no"
				,"Outlook not so good"
				,"Very doubtful"
		};
		char temp = 'o';
		
		do {
			System.out.println("Please ask me a question: ");
			question = scan.nextLine();
			
			randomNumber = rand.nextInt(anwsers.length);
			
			System.out.println("YOU ASKED: " + question);
			System.out.println("MAGIC 8-BALL SAYS: " + anwsers[randomNumber]);
		 
			System.out.println("would you like to ask another question?(y/n): ");
			do {
				temp = scan.next().toLowerCase().charAt(0);
				scan.next();
			} while (!(temp == 'y' || temp == 'n'));
			
		 
		 
		 
		} while (temp == 'y');
		
		System.out.println("");
		
	}

}


/*

Create a program that mimics the Magic 8 Ball. If you don't know what a Magic 8 Ball is ... it's a toy ball containing a clear 'window'. You shake the ball and ask it a question. A random response rises to the window. You can read about the Magis 8 Ball on Wikipedia (Links to an external site.)Links to an external site..

Your program will prompt the user for a question and select a random answer from the list below. See the required output below the responses.

● It is certain
● It is decidedly so
● Without a doubt
● Yes definitely
● You may rely on it
● As I see it, yes
● Most likely
● Outlook good
● Yes
● Signs point to yes
● Reply hazy try again
● Ask again later
● Better not tell you now
● Cannot predict now
● Concentrate and ask again
● Don't count on it
● My reply is no
● My sources say no
● Outlook not so good
● Very doubtful

 

Display the question and the answer to the user.

YOU ASKED: Will I win the lottery tomorrow?
 
MAGIC 8-BALL SAYS: Reply hazy, try again
 
Do you have another question for the Magic 8-Ball? (y/n)

*/