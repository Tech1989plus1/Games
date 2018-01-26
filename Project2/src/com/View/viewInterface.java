package com.View;
import java.util.Scanner;

public interface viewInterface {

public int start();

//Creates and random board for which game is selected
public void randomBoard();
	
//Inserting X and Y values
public void move();

//Console for user
public boolean mainMenu();

public boolean printBoard();

public void solution();

public int checkValid(int max, int min);
}
