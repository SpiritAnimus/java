package aaa;

public class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	public TV() {
	}
	public void turnOn() {
		on = true;
	}
	public void turnOff() {
		on = false;
	}
	public void setChannel(int a) {
		if(on && a>=1 && a <=120)
			channel = a;
	}
	public void setVolume(int a) {
		if(on && a>=1 && a <=7 )
			volumeLevel = a;
	}
	public void channel1Up() {
		if(on && channel < 120)channel++;
	}
	public void channel1Down() {
		if(on && channel > 1)channel--;
	}
	public void volumeUp() {
		if(on && volumeLevel < 7)volumeLevel++;
	}
	public void volumeDown() {
		if(on && volumeLevel>1)volumeLevel--;
	}
}
