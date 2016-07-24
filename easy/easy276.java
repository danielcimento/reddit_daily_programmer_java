public class easy276{
	public static void main(String[] args){
		recktangles("REKT", 3, 2);
		System.out.println();
		recktangles("WEWLADS", 7, 5);
		System.out.println();
		recktangles("MODS=GODS", 4, 6);
	}

	public static void recktangles(String word, int width, int height){
		int rows = word.length() + (height-1) * (word.length()-1);
		int columns = word.length() + (width-1) * (word.length()-1);
		//"Fencepost" problem. Start with length, then add length-1 for every next section added
		char[][] grid = new char[rows][columns]; //rows, columns
		boolean reversing = false;
		boolean lineReversing = false;		
		int pointer = 0;

		//fill out rows
		for(int i = 0; i < rows; i += (word.length() - 1)){
			if(lineReversing){
				pointer = word.length() - 1;
				reversing = true;
			}else{
				pointer = 0;
				reversing = false;
			}
			for(int j = 0; j < columns; j++){
				grid[i][j] = word.charAt(pointer);
				//end/beginning of word reached
				if((pointer == word.length() - 1 && !reversing) || (pointer == 0 && reversing)){
					reversing = !reversing;
				}
				if(!reversing){
					pointer++;
				}else{
					pointer--;
				}
			}
			lineReversing = !lineReversing;
		}
		lineReversing = false;	
		//fill out columns
		for(int i = 0; i < columns; i += (word.length() - 1)){
			if(lineReversing){
				pointer = word.length() - 1;
				reversing = true;
			}else{
				pointer = 0;
				reversing = false;
			}
			for(int j = 0; j < rows; j++){
				grid[j][i] = word.charAt(pointer);
				if((pointer == word.length() - 1 && !reversing) | (pointer == 0 && reversing)){
					reversing = !reversing;
				}

				if(!reversing){
					pointer++;
				}else{
					pointer--;
				}
			}
			lineReversing = !lineReversing;
		}

		//print
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				//didn't get filled in, default to 2 spaces
				if(grid[i][j] != '\u0000')
					System.out.print(grid[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}


}
