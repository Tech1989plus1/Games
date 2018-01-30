package main;
import com.Controller.gameController;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("[0] Console, [1] Graphical User Interface (GUI): ");
		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()) {
		case 0:
			new gameController();
			break;
			
		case 1:
			//GUI will go right here
			break;
		}
	}

}
