import java.util.Random;

public class easy4{


	public static String passwordGenerate(int length){
		Random r = new Random();
		String password = "";

		for(int i = 0; i < length; i++){
			int nextStep = r.nextInt(63);
			if(nextStep < 10){
				password += nextStep;
			}else if(nextStep < 37){
				password += (char)('a' + (nextStep%26));
			}else{
				password += (char)('A' + (nextStep%26));
			}
		}

		return password;

	}

	public static String[] passwordGenerate(int length, int count){
		String[] passwords = new String[count];
		for(int i = 0; i < count; i++){
			passwords[i] = passwordGenerate(length);
		}
		return passwords;
	}

	public static String passwordGenerate(){
		return passwordGenerate(8);
	}

	public static void main(String[] args){
		System.out.println(passwordGenerate());
		System.out.println(passwordGenerate(5));
		System.out.println(passwordGenerate(66));
		for(String s : passwordGenerate(10, 5))
			System.out.println(s);
	}

}
