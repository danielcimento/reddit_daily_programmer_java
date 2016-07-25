import java.io.*;
import java.util.Scanner;


public class easy5{
	public static void main(String[] args){
		try{
		Scanner s = new Scanner(System.in);
		System.out.print("Username:");
		String username = s.next();
		System.out.print("\nPassword:");
		String password = s.next();
		BufferedReader r = new BufferedReader(new FileReader(new File("usernames.txt")));
		String line = r.readLine();
		boolean validUsername = false;
		while(line != null){
			if(line.equals(username)){
				validUsername = true;
				break;
			}
			line = r.readLine();
		}
		boolean validLogin = false;
		if(validUsername){
			int passwordKey = username.hashCode();
			r = new BufferedReader(new FileReader(new File("passwords.txt")));
			line = r.readLine();
			while(line != null){
				if(line.startsWith(""+passwordKey)){
					if(line.substring(line.length() - password.length(), line.length()).equals(password)){
						validLogin = true;
						break;
					}else{
						System.out.println(line.substring(line.length()-password.length(), line.length()-1));
					}
				}
				line = r.readLine();
			}
			if(validLogin){
				superSecretFunction(username);
			}
		}else{
			System.out.println("Wrong Password!");
			return;
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static void superSecretFunction(String username){
		System.out.println("Hello, " + username);
	}

}
