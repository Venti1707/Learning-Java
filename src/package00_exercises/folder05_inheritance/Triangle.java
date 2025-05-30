package package00_exercises.folder05_inheritance;
//                    ----- Similar to an "is a" relationship (Triangle is a polygon, but a polygon may not necessarily be a triangle)
//                    |
public class Triangle extends Polygon {
	public void calculateArea() {
		double area = 0.5 * base * height;
		System.out.println("The area of the triangle with a base of " + base + " units and a height of " + height + " units is " + area + "units²");
	}
}