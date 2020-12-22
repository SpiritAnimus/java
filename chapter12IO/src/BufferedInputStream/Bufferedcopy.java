package BufferedInputStream;
import java.util.*;
import java.io.*;
public class Bufferedcopy {
	public static void main(String [] args)throws Exception {
		BufferedInputStream cin = new BufferedInputStream(new FileInputStream("src/BufferedInputStream/input.txt"));
		BufferedOutputStream cout = new BufferedOutputStream(new FileOutputStream("src/BufferedInputStream/copy.txt"));
		byte b[] = new byte[1024];
		int len = 0;
		while((len = cin.read(b))!=-1) {
			System.out.println("?");
			cout.write(b,0,len);
		}
		//System.out.println(cout.toString());
		cout.flush();
	}
}
