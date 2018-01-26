package com.Move;

public class SudoBlock {
	//solution for block
	private char value;
	
	//state of block
	private char playerValue;


	//private boolean preSolved;
	
	public SudoBlock(int value) {
		if(value<0||value>9)
			value = 0;
		this.value= (char) ('0'+value);
	}
	
	public void setValue(int value) {
		if(value<0||value>9)
			value = 0;
		this.value= (char) ('0'+value);
	}
	
	public char getValue() {
		return value;
	}

	public char getPlayerValue() {
		return playerValue;
	}
	
	public void setPlayerValue(int value) {
		if(value<0||value>9)
			value = 0;
		this.playerValue= (char) ('0'+value);
	}
	
	public boolean isCorrect() {
		return this.value==this.playerValue;
	}

	public String toString() {
		return String.valueOf(playerValue);
	}
	
	public String solution() {
		return String.valueOf(value);
	}
}
