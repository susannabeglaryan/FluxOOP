
public abstract class Transport {

	private boolean isNew;
	private String color;
	private int seatsNumber;
	// private String model;

	protected Transport() {
		super();
	}

	protected Transport(boolean isNew, String color, int seatsNumber) {
		super();
		this.isNew = isNew;
		this.color = color;
		this.seatsNumber = seatsNumber;
	}

	public boolean isNew() {
		return isNew;
	}
	
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	protected String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void howToStart();

	public abstract void howToStop();

}
