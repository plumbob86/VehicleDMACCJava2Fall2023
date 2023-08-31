import model.Car;
import model.Example;
import model.Car;
import model.Train;
import model.Boat;
public class VehicleNoise {
	
	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.makeNoise());
		
		/*
		 * Add a call to your vehicle below this comment.
		 */
		
		Boat boat = new Boat();
		System.out.println(boat.makeNoise());
		
		Car car = new Car();
		System.out.println(car.makeNoise());
		
		Train train = new Train();
		System.out.println(train.makeNoise());
		

		// my vehicle noise
		Car Mustang = new Car();
		System.out.println(Mustang.makeNoise());

	}

}	