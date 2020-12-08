package project2;

public class Student implements Comparable{
	public String Number;
	public String Name;
	public int Age;
	public Student(){}
	public Student(String a,String b ,int c) {
		Number = a;
		Name = b;
		Age = c;
	}
	public int compareTo(Object o) {
		if(!(o instanceof Student))
			throw new RuntimeException("不是Student对象");
		Student a = (Student)o;
		return Age>a.Age?1:Age==a.Age?0:-1;
	}
}
