package curriculum_B;
//Q5
public class Animal {

	private String name;
	private double length;
	private int speed;
	
	public void putInName(String name) {
		this.name = name;
	}
	public void putInLength(double length) {
		this.length = length;
	}
	public void putInSpeed(int speed) {
		this.speed = speed;
	}
	
	public String takeName() {
		return this.name;
	}
	public double takeLength() {
		return this.length; 
	}
	public int takeSpeed() {
		return this.speed;
	}
}
