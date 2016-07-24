import java.util.Scanner;
import java.util.Random;

public class difficult1{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		boolean guessed = false;
		int lowestGuess = 1;
		int highestGuess = 100;
		int currentGuess;
		while(!guessed){
			currentGuess = r.nextInt(highestGuess - lowestGuess + 1) + lowestGuess;
			System.out.println("I'm guessing your number was " + currentGuess + ". Was I right? (y/n)");
			if(!s.next().equals("y")){
				System.out.println("Aww, was I too high or too low? (h/l)");
				String response = s.next();
				if(response.equals("h")){
					highestGuess = currentGuess - 1;
				}else if(response.equals("l")){
					lowestGuess = currentGuess + 1;
				}else{
					System.out.println("Huh? Didn't understand that! Lemme guess again!");
				}
			}else{
				System.out.println("Hooray! I did it!");
				guessed = true;
			}
		}
	}
}
