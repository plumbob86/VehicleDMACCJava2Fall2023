import model.Example;
import model.Train;
import model.Truck;
public class VehicleNoise {
	
	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.makeNoise());
		
		/*
		 * Add a call to your vehicle below this comment.
		 */
		
		Train train = new Train();
		System.out.println(train.makeNoise());
		
		Truck f250 = new Truck();
		System.out.println(f250.makeNoise());
		

	}

}
