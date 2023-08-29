import model.Example;
import model.Train;
import model.DirtBike;

public class VehicleNoise {
	
	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.makeNoise());
		
		/*
		 * Add a call to your vehicle below this comment.
		 */
		
		Train train = new Train();
		System.out.println(train.makeNoise());

		DirtBike dirtbike = new DirtBike("Eli Tomac", 450, "Blue");
		System.out.println(dirtbike.makeNoise());
	}

}
