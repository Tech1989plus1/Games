package com.View;

public interface viewInterface{

public int start();

public void setRow();

public int getRow();

public void setColumn();

public int getColumn();

//Move method user enters in a row and column; returns nothing
public void move();

//checkValid method checks to see if user input is correct
//returns input value, passes in a min in max value
public int checkValid(int min, int max);

public void printBoard();
}
