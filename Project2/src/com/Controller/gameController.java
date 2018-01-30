package com.Controller;

public class gameController {

	private viewConsole viewconsole;
	private viewSudoku sudoku;
	private viewNonogram vnonogram;
	private SudokuBoard sboard;
	private GridGame game;
	private NonoBoard nonogram;
	private int userinput;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	public Controller( viewConsole view){
		
		this.viewconsole = view;	
		int input;
		
		
		input = this.viewconsole.start();
		if(input == 1){
			sudoku.getGame();
			userinput = sudoku.start();
			
			sudoku.printBoard();
		}
		else if(input == 0){
			nonogram.getGame();
			userinput = vnonogram.start();
			
			vnonogram.printBoard();
		}
		
		
	
		
		
		
	}
	
	public String toString(){
		return game.toString();
	}
	
	public boolean checkifSolved(){
		return game.isSolved();
	}
	
	public boolean changeBlock(int x, int y, int z){
		return game.changeBlock(x,y,z);
	}
	
	
	
	
	public int start(){
		return viewconsole.start();
	}
	public void printBoard(){
		viewconsole.printBoard();
	}
	public int checkValid(int max, int min){
		return viewconsole.checkValid(max, min);
	}
	
	*/

}
