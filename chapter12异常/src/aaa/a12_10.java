package aaa;
import java.util.*;
public class a12_10 {
	public static void main(String[]args) throws OutOfMemoryError{
		ArrayList<String>lst = new ArrayList<String>();
		
		while(true) {
			try {
				lst.add("asjfhakjfhka");
			}
			catch (OutOfMemoryError ex) {
				System.out.println(ex.toString());
				break;
			}
		}
		
		System.out.println("End");
	}
}
