package chapter7;
import java.util.Scanner;
public class a7_18 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0 ;i<10;i++)
			arr[i]=in.nextInt();
		for(int i = 0;i<arr.length-1;i++)
			for(int j = i+1;j>0;j--)
				if(arr[j-1]>arr[j]) {
					arr[j-1]^=arr[j];
					arr[j]^=arr[j-1];
					arr[j-1]^=arr[j];
				}
		for(int i = 0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
