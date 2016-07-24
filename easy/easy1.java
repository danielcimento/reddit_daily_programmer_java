import java.util.Scanner;

public class easy1{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = input.next();
		System.out.print("What is your age? ");
		String age = input.next();
		System.out.print("What is your reddit username? ");
		String username = input.next();
		
		System.out.println("Your name is " + name + ", you are " + age + " years old, and your username is " + username);
		
	}

}
