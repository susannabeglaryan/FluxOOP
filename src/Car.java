
public class Car extends Transport {

	private String mark;
	private Boolean isLeftWheel;
	
	public Car() {
		super();
	}

	public Car(String mark, Boolean isLeftWheel) {
		super();
		this.mark = mark;
		this.isLeftWheel = isLeftWheel;
	}

	public Car(String mark, Boolean isLeftWheel, boolean isNew, String color, int seatsNumber) {
		super(isNew, color, seatsNumber);
		this.mark = mark;
		this.isLeftWheel = isLeftWheel;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Boolean getIsLeftWheel() {
		return isLeftWheel;
	}

	public void setIsLeftWheel(Boolean isLeftWheel) {
		this.isLeftWheel = isLeftWheel;
	}

	@Override
	public void howToStart() {
		System.out.println("Car: Put on seat belt, insert and twist key, push gas pedal");
	}

	@Override
	public void howToStop() {
		System.out.println("Car: Push brake pedal, turn off car");
	}

}
