package aaa;

import java.util.Scanner;

public class a12_9 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String hex = in.next();
		try {
			bin2dec(hex);		
		}
		catch (BianryFormatException ex) {
			System.out.println(ex.toString());
		}
		
	}
	public static void bin2dec(String bin) throws BianryFormatException{
		int ans = 0;
		for(int i = 0;i<bin.length();i++) {
			char a = bin.charAt(i);
			if(a>='0'&&a<='1') {
				ans = ans*2+a-'0';
			}
			else throw new BianryFormatException("不是二进制");
		}
		System.out.println(ans);
	}
}
