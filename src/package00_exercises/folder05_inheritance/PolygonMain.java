package package00_exercises.folder05_inheritance;

public class PolygonMain {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setBaseAndHeight(17.07, 88.36);
		t1.calculateArea();
		
		Rectangle r1 = new Rectangle();
		r1.setBaseAndHeight(17.07, 88.36);
		r1.calculateArea();
	}
}