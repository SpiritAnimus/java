package project2;
import java.util.*;
import java.io.*;
public class test {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		Set<Student> s = new TreeSet<Student>();
		String a,b;
		int c;
		while(true) {
			a=in.next();
			if(a.equals("exit"))break;
			b=in.next();
			c=in.nextInt();
			Student ths = new Student(a,b,c);
			s.add(ths);
		}
		System.out.println("开始写入文件");
		File file = new File("StudentInfo.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write("学号----------姓名-----------年龄\n");
		int cnt = 0;
		for(Student x:s) {
			System.out.println("写入第" + ++cnt + "条");
			writer.write(x.Number+"-----"+x.Name+"-----"+
					x.Age+"\n");
			writer.flush();
		}
		writer.close();
	}
}
