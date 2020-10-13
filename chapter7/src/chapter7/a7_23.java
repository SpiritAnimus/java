package chapter7;
import java.util.Arrays;
import java.util.Scanner;
public class a7_23 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[101];
		Arrays.fill(arr, 1);
		for(int i = 2;i<101;i++) {
			for(int j = i;j<101;j+=i)
				arr[j]^=1;
		}
		for(int i = 1;i<101;i++)
			if(arr[i]==1)System.out.println(i);
	}
}
