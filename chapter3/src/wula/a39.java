package wula;
import java.util.Scanner;
public class a39 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int ans = 0;
		for(int i = 0;i<s.length();i++)
			ans += (s.charAt(i)-'0')*(i+1);
		ans%=11;
		System.out.println(s+(ans==10?'X':ans));
	}
}
