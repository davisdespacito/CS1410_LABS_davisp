package docComments;

/**
 * 
 */
public class TripPlanner {

	private String departure;
	private String arrival;
	private int distance;
	private Car car;

	public static void main(String[] args) {

		Car m4 = new Car("BMW", "M4", 25);
		Car civic = new Car("Honda", "Civic", 42);

	}

	/**
	 * 
	 * @param departure
	 * @param arrival
	 * @param distance
	 * @param car
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) {

		// TODO

	}

	public double fuelConsumption() {
		// TODO
		return 0;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		// TODO
		return car.getMake() + " " + car.getModel() + " " + car.getMpg() + "mpg %n";
	}

}
