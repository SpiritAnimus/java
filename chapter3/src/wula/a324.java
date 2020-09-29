package wula;
import java.util.Scanner;
public class a324 {
	public static void main(String args[]) {
		String card[]= {"Ace","1","2","3","4","5","6","7"
				,"8","9","Jack","Queen","King"};
		String color[]= {"Clubs","Diamonds","Hearts","Spades"};
		int rdcard = (int)(Math.random()*(12+1));
		int rdcol = (int)(Math.random()*(5));
		System.out.println("The card you picked is "+
				card[rdcard]+" of "+color[rdcol]);
			
	}
}