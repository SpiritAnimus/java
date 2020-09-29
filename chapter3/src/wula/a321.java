package wula;
import java.util.Scanner;
public class a321 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		int year = in.nextInt();
		System.out.println("Enter month: 1-12: ");
		int month = in.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		int date = in.nextInt();
		if(month==1) {
			month=13;
			year--;
		}
		if(month==2) {
			month=14;
			year--;
		}
		int h = (int)(date+26*(month+1)/10+year%100+(year%100)/4+
				Math.ceil((year/100))/4+Math.ceil((year/100))*5)%7;
		String wek[] = {"Saturday","Sunday","Monday","Thuesday","Wednesday"
				,"Thursday","Friday"};
		System.out.println(wek[h]);
	}
}

