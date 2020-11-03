package caaa;
import java.util.GregorianCalendar;
public class a9_5 {
	public static void main(String [] args) {
		GregorianCalendar now = new GregorianCalendar();
		System.out.println(now.get(now.YEAR));
		System.out.println(now.get(now.MONTH));
		System.out.println(now.get(now.DAY_OF_MONTH));
		now.setTimeInMillis(1234567898765L);
		System.out.println(now.get(now.YEAR));
		System.out.println(now.get(now.MONTH));
		System.out.println(now.get(now.DAY_OF_MONTH));
	}
}
