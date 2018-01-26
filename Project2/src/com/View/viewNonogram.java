package com.View;

import java.lang.Exception;
import java.util.Scanner;


public class viewNonogram implements viewInterface {
	private int row, column;
	static Scanner userInput = new Scanner(System.in);
	
	@Override
	public int start() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Nonogram");
		System.out.print("[-1]: Exit, [0]: Random nonogram board: ");
		
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
/*
	@Override
	public boolean mainMenu() {
		// TODO Auto-generated method stub
		boolean finish = false;
		
		while(!finish) {
			finish = printBoard();
			move(new Scanner(System.in));
			
			if(finish) 
				System.out.println("Congratulations! You solved nonogram!");
		}
		
		return false;
	}

	@Override
	public void randomBoard(Scanner input) {
		// TODO Auto-generated method stub
		
		System.out.print("Number of rows (max15): ");
		row = input.nextInt();
		
		System.out.print("Number of columns (max15):");
		column = input.nextInt();
	}

	@Override
	public boolean printBoard() {
		// TODO Auto-generated method stub
		System.out.println(board.toString());
		System.out.println();
		
		return board.isBoardSolved();
	}

	@Override
	public void solution() {
		// TODO Auto-generated method stub
		
	}

*/
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
