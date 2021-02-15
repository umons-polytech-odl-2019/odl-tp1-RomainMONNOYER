package exercise3;

public class Rectangle extends ConvexPolygon {
	private Point upperLeft;
	private Point lowerRight;

	public Rectangle(Point upperLeft, Point lowerRight) {
		super(new Point[]{
			upperLeft,
			new Point(lowerRight.getX(), upperLeft.getY()),
			lowerRight,
			new Point(upperLeft.getX(), lowerRight.getY()) });
		this.upperLeft = upperLeft;
		this.lowerRight = lowerRight;
	}

	private Point [] otherPoints() {
		Point upperRight = new Point(lowerRight.getX(), upperLeft.getY());
		Point lowerLeft = new Point(upperLeft.getX(), lowerRight.getY());
		Point vertices[] = {upperLeft, upperRight, lowerRight, lowerLeft};
		return vertices;
	}
}
