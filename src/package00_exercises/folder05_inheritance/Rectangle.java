package package00_exercises.folder05_inheritance;

//                     ----- Similar to an "is a" relationship (Rectangle is a polygon, but a polygon may not necessarily be a rectangle)
//                     |
public class Rectangle extends Polygon {
	public void calculateArea() {
		double area = base * height;
		System.out.println("The area of the rectangle with a base of " + base + " units and a height of " + height + " units is " + area + "units²");
	}
}