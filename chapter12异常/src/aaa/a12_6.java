package aaa;
import java.util.*;
public class a12_6 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String hex = in.next();
		try {
			hextodec(hex);		
		}
		catch (NumberFormatException ex) {
			System.out.println("不是十六进制");
		}
		
	}
	public static void hextodec(String hex) {
		int ans = 0;
		for(int i = 0;i<hex.length();i++) {
			char a = hex.charAt(i);
			if(a>='0'&&a<='9') {
				ans = ans*16+a-'0';
			}
			else if(a>='A'&& a<='F') {
				ans = ans*16 + a-'A';
			}
			else throw new NumberFormatException();
		}
		System.out.println(ans);
	}
}
