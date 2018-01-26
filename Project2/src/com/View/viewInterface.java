package com.View;
import java.util.Scanner;

public interface viewInterface {

static Scanner userInput = new Scanner(System.in);

public int start();

//Creates and random board for which game is selected
public void randomBoard();
	
//Move method user enters in a row and column; returns nothing
public void move();

//checkValid method checks to see if user input is correct
//returns input value, passes in a min in max value
public int checkValid(int max, int min);

}
