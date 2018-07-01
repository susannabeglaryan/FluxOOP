
public abstract class Bird {
	private String color;
	private int weight;
	
	public Bird() {
		super();
	}

	public Bird(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public abstract void sound();
}
