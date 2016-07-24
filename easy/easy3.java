

public class easy3{
	public static void main(String[] args){
		System.out.println(encrypt("Doggo! Get down, boy!", 13));
	}

	public static String encrypt(String arg, int offset){
		String result = "";
		for(char c : arg.toCharArray()){
			if(c >= 'a' && c <= 'z'){
				result += (char)(((c-'a') + offset)%26 + 'a');
			}else if(c >= 'A' && c <= 'Z'){
				result += (char)(((c-'A') + offset)%26 + 'A');
			}else{
				result += c;
			}
		}
		return result;
	}

}
