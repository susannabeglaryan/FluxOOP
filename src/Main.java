import javax.management.InstanceAlreadyExistsException;

public class Main {

	public static void main(String[] args) {

		Transport[] transports = { new Car("BMW", true), new Bicycle(2, false, "blue", 2), new Plane() };

		Bird[] birds = { new Colibri(), new Duck("white", 5), new Colibri(500) };

		FlyingObject[] flyingObjects = { new Plane(3, false, 11000), new Colibri(), new Colibri(150, "Red", 1) };

		Object[] objects = {new Plane(3, false, 11000), new Colibri(), new Colibri(150, "Red", 1), new Car("BMW", true)};
		
//		System.out.println("How to start transports");
//		for (int i = 0; i < transports.length; i++) {
//			System.out.print((i + 1) + ".");
//			transports[i].howToStart();
//		}
//
//		System.out.println("\nBirds");
//		for (int i = 0; i < birds.length; i++) {
//			System.out.print((i + 1) + ".");
//			birds[i].sound();
//		}
//
//		System.out.println("\nFlying Objects");
//		for (int i = 0; i < flyingObjects.length; i++) {
//			System.out.print((i + 1) + ".");
//			flyingObjects[i].howHighCanFly();
//		}
		
		for (int i = 0; i < objects.length; i++) {
			System.out.print((i + 1) + ". ");
			if(objects[i] instanceof FlyingObject)
				((FlyingObject) objects[i]).howHighCanFly();
			
			if(objects[i] instanceof Transport)
				((Transport) objects[i]).howToStart();
			else if(objects[i] instanceof Bird)
				((Bird) objects[i]).sound();
		}
	
		
	}

}
