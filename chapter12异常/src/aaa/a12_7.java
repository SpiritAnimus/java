package aaa;
import java.util.*;
public class a12_7 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String hex = in.next();
		try {
			bin2dec(hex);		
		}
		catch (NumberFormatException ex) {
			System.out.println("不是二进制");
		}
		
	}
	public static void bin2dec(String bin) {
		int ans = 0;
		for(int i = 0;i<bin.length();i++) {
			char a = bin.charAt(i);
			if(a>='0'&&a<='1') {
				ans = ans*2+a-'0';
			}
			else throw new NumberFormatException();
		}
		System.out.println(ans);
	}
}
