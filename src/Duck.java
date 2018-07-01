
public class Duck extends Bird {

	public Duck() {
		super();
	}

	public Duck(String color, int weight) {
		super(color, weight);

	}

	@Override
	public void sound() {
		System.out.println("Duck: Kua-Kua-Kua");
	}

}
