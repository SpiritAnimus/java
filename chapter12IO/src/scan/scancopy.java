package scan;
import java.util.*;
import java.io.*;
public class scancopy {
	public static void main(String [] args)throws Exception {
		File file = new File("src/scan/input.txt");
		Scanner cin = new Scanner(file);
		PrintWriter cout = new PrintWriter(new File("src/scan/copy.txt"));
		while(cin.hasNextLine())
			cout.println(cin.nextLine());
		cin.close();
		cout.close();
		
	}
}
