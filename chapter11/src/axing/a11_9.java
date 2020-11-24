package axing;
import java.util.*;
public class a11_9 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [][] mp = new int[n][n];
		int []sumr = new int[n];
		int []sumc = new int[n];
		ArrayList row = new ArrayList();
		ArrayList col = new ArrayList();
		Random r = new Random(114514);
		for(int i = 0;i<n;i++)
			for(int j = 0;j<n;j++)
				mp[i][j] = r.nextInt(2);
		int maxr=0,maxc=0;
		for(int i = 0;i<n;i++) {
			sumr[i]=0;
			for(int j = 0;j<n;j++) {
				System.out.print(mp[i][j]);
				if(mp[i][j]==1)sumr[i]++;
			}
			System.out.print("\n");
			if(sumr[i]>maxr)maxr=sumr[i];
		}
		for(int i = 0;i<n;i++) {
			sumc[i]=0;
			for(int j = 0;j<n;j++)
				if(mp[j][i]==1)sumc[i]++;
			if(sumc[i]>maxc)maxc=sumc[i];
		}
		for(int i = 0;i<n;i++) {
			if(sumr[i]==maxr)row.add(i);
			if(sumc[i]==maxc)col.add(i);
		}
		System.out.println("The largest row index: ");
		for(int i = 0;i<row.size();i++)
			System.out.print(row.get(i) + (i==row.size()-1?"\n":" "));
		System.out.println("The largest col index: ");
		for(int i = 0;i<col.size();i++)
			System.out.print(col.get(i) + (i==col.size()-1?"\n":" "));
	}
}
