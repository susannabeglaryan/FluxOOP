
public class Plane extends Transport implements FlyingObject {
	private int pilotsNumber;
	private Boolean autopilotOn;
	private int flightHeight;

	public Plane() {
		super();
	}

	public Plane(int pilotsNumber, Boolean autopilotOn, int flightHeight) {
		super();
		this.pilotsNumber = pilotsNumber;
		this.autopilotOn = autopilotOn;
		this.flightHeight = flightHeight;
	}

	public Plane(int pilotsNumber, Boolean autopilotOn, boolean isNew, String color, int seatsNumber) {
		super(isNew, color, seatsNumber);
		this.pilotsNumber = pilotsNumber;
		this.autopilotOn = autopilotOn;
	}

	public int getPilotsNumber() {
		return pilotsNumber;
	}

	public void setPilotsNumber(int pilotsNumber) {
		this.pilotsNumber = pilotsNumber;
	}

	public Boolean getAutopilotOn() {
		return autopilotOn;
	}

	public void setAutopilotOn(Boolean autopilotOn) {
		this.autopilotOn = autopilotOn;
	}

	@Override
	public void howToStart() {
		System.out.println("Plane: Instuctions for statring plane");
	}

	@Override
	public void howToStop() {
		System.out.println("Plane: Instructions for stopping plane");
	}

	@Override
	public void howHighCanFly() {
		System.out.println("Plane: " + flightHeight + "m");
	}

}
