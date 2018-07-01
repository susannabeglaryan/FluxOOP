
public class Bicycle extends Transport {
	private int wheelNumber;

	public Bicycle() {
		super();
		this.wheelNumber = 2;
	}

	public Bicycle(int wheelNumber) {
		super();
		this.wheelNumber = wheelNumber;
	}

	public Bicycle(int wheelNumber,boolean isNew, String color, int seatsNumber) {
		super(isNew, color, seatsNumber);
		this.wheelNumber = wheelNumber;
	}

	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}
	
	@Override
	public void howToStart() {
		System.out.println("Bicycle: Seat comfortabble, start pedaling");
	}

	@Override
	public void howToStop() {
		System.out.println("Bicyvle: Stop bicycle");
	}

}
