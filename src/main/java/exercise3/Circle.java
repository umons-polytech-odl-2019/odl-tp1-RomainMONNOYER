package exercise3;

public class Circle extends Ellipsis {

	private Point center;
	private int radius;

	public Circle(Point center, int radius) {
		super(center, radius, radius);
		this.center = center;
		this.radius = radius;
	}
}
