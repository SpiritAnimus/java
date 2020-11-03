package a9_6;
import java.util.Date;
import javax.swing.Timer;
public class StopWatch {
	private long startTime,endTime;
	public StopWatch(){
		Date now = new Date();
		startTime = now.getTime();
	}
	public void start() {
		Date now = new Date();
		startTime = now.getTime();
	}
	public void stop() {
		Date now = new Date();
		endTime = now.getTime();
	}
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public long getElapsedTime() {
		return getEndTime() - getStartTime();
	}
}
