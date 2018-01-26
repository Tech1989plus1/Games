package com.View;
import java.util.Scanner;
public class viewNonogram implements viewInterface {
	
	private int row, column;
	static Scanner userInput = new Scanner(System.in);
	
	@Override
	public int start() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Nonogram");
		System.out.print("[-1]: Exit, [0]: Random Board: ");
		
		return checkValid(-1, 0);
	}
	
	@Override
	public void randomBoard() {
		// TODO Auto-generated method stub
		int MAX = 15, MIN = 0;
		System.out.print("Number of rows (max15): ");
		row = checkValid(MIN, MAX);
		
		System.out.print("Number of columns (max15):");
		column = checkValid(MIN, MAX);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		int zero = 0;
		
		System.out.print("Row: ");
		int rowMove = checkValid(zero, row); 
		
		System.out.print("Column: ");
		int columnMove = checkValid(zero, column);
		
		/*
		 * changeBlock will go right here (from the move)
		 */
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
