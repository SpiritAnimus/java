package aaa;
import java.util.Scanner;
public class a12_8 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String hex = in.next();
		try {
			hextodec(hex);		
		}
		catch (HexFormatException ex) {
			System.out.println(ex.toString());
		}
		
	}
	public static void hextodec(String hex) throws HexFormatException {
		int ans = 0;
		for(int i = 0;i<hex.length();i++) {
			char a = hex.charAt(i);
			if(a>='0'&&a<='9') {
				ans = ans*16+a-'0';
			}
			else if(a>='A'&& a<='F') {
				ans = ans*16 + a-'A';
			}
			else throw new HexFormatException("不是十六进制");
		}
		System.out.println(ans);
	}
}
