package com.View;

import java.util.Scanner;

public class viewConsole implements viewInterface {

	static Scanner userInput;
	
	public viewConsole() {
		userInput = new Scanner(System.in);
	}
	
	@Override
	public int start() {
		// TODO Auto-generated method stub
		int min = 0, max = 1;
		
		System.out.print("[0] Nonogram, [1] Sudoku: ");
		
		
		return checkValid(min, max);
	}


	@Override
	public int checkValid(int min, int max) {
		// TODO Auto-generated method stub
		boolean valid = false;
		
		while(!valid) {
			try {
				int num = userInput.nextInt();
				
				if(!(num >= min && num <= max))
					throw new Exception("Invalid try again: ");
				
				return num;
				
			} catch(Exception ex) {
				System.out.print(ex.getMessage());
			}
		}
		
		return 0;
	}
	
}
