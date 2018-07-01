
public class Colibri extends Bird implements FlyingObject {

	private int flightHeight;

	public Colibri() {
		super();
	}

	public Colibri(int flightHeight) {
		super();
		this.flightHeight = flightHeight;
	}

	public Colibri(int flightHeight, String color, int weight) {
		super(color, weight);
		this.flightHeight = flightHeight;
	}

	@Override
	public void sound() {
		System.out.println("Colibri: Tshew-tshew");
	}

	@Override
	public void howHighCanFly() {
		System.out.println("Colibri: " + flightHeight + "m");
	}

}
