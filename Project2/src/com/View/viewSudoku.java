package com.View;
import java.util.Scanner;

public class viewSudoku implements viewInterface{

	private int row, column;
	Scanner userInput = new Scanner(System.in);
	
	@Override
	public int start() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Sudoku");
		System.out.print("[-1]: Exit, [0]: Start Game: ");
		
		return checkValid(-1, 0);
	}

	@Override
	public void randomBoard() {
		// TODO Auto-generated method stub
		
		this.row = this.column = 9;	
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		int zero = 0;
		
		System.out.print("Row: ");
		int rowMove = checkValid(zero, row); 
		
		System.out.print("Column: ");
		int columnMove = checkValid(zero, column);
		
		System.out.print("Value: ");
		int value = checkValid(zero, column);
	}

	@Override
	public int checkValid(int max, int min) {
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

	@Override
	public void printBoard() {
		String [] scale = {" ","1","2","3","4","5","6","7","8","9"};
		for(int index = 0; index <= row; index++) {
			for(int jndex = 0; jndex <= column; jndex++) {
				if(index == 0)
					System.out.print(scale[jndex]);
				else if(jndex == 0)
					System.out.print(scale[index]);
				else
					System.out.print("-");//Board info right here
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	

	
	
}
