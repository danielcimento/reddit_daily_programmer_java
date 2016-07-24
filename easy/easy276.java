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
		char[][] grid = new char[rows][columns]; //rows, columns
		boolean reversing = false;
		boolean rowReversing = false;
		boolean columnReversing = false;		
		int horizontalPointer = 0;

		//fill out rows
		for(int i = 0; i < rows; i += (word.length() - 1)){
			if(rowReversing){
				horizontalPointer = word.length() - 1;
				reversing = true;
			}else{
				horizontalPointer = 0;
				reversing = false;
			}
			for(int j = 0; j < columns; j++){
				grid[i][j] = word.charAt(horizontalPointer);
				if((horizontalPointer == word.length() - 1 && !reversing) || (horizontalPointer == 0 && reversing)){
					reversing = !reversing;
				}
				if(!reversing){
					horizontalPointer++;
				}else{
					horizontalPointer--;
				}
			}
			rowReversing = !rowReversing;
		}
		
		//fill out columns
		for(int i = 0; i < columns; i += (word.length() - 1)){
			if(columnReversing){
				horizontalPointer = word.length() - 1;
				reversing = true;
			}else{
				horizontalPointer = 0;
				reversing = false;
			}
			for(int j = 0; j < rows; j++){
				grid[j][i] = word.charAt(horizontalPointer);
				if((horizontalPointer == word.length() - 1 && !reversing) | (horizontalPointer == 0 && reversing)){
					reversing = !reversing;
				}

				if(!reversing){
					horizontalPointer++;
				}else{
					horizontalPointer--;
				}
			}
			columnReversing = !columnReversing;
		}

		//print
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				if(grid[i][j] != '\u0000')
					System.out.print(grid[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}


}
