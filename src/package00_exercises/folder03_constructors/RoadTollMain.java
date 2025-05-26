package package00_exercises.folder03_constructors;

public class RoadTollMain {
	public static void main(String[] args) {
		RoadToll rT1 = new RoadToll();
		rT1.type = "Car";
		rT1.tyreCount = 4;
		rT1.calculateToll();
		
		// Using the constructor
		RoadToll rT2 = new RoadToll("Bicycle", 2);
		rT2.calculateToll();
	}
}