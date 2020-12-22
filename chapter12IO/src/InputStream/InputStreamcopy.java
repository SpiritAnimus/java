package InputStream;
import java.util.*;
import java.io.*;
public class InputStreamcopy {
	public static void main(String [] args)throws Exception {
		FileInputStream cin = new FileInputStream("src/InputStream/input.txt");
		FileOutputStream cout = new FileOutputStream(new File("src/InputStream/copy.txt"));
		byte b[] = new byte[1024];
		int len = 0;
		while((len = cin.read(b))!=-1) {
			cout.write(b,0,len);
		}
		
	}
}
