package a9_6;
import java.util.Date;
import java.util.Random;
public class test {
	public static void main(String[] args) {
		StopWatch a = new StopWatch();
		int []num = new int[100000];
		Random r = new Random(114514);
		for(int i = 0;i<num.length;i++)
			num[i]=r.nextInt();
		a.start();
		for(int i = 0 ;i<num.length-1;i++) {
			int index = i;
			for(int j = 0;j<num.length;j++)
				if(num[index]>num[j])index=j;
			num[index]^=num[i];
			num[i]^=num[index];
			num[index]^=num[i];
		}
		a.stop();
		System.out.println(a.getElapsedTime());
	}
}
