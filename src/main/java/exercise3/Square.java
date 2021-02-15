package exercise3;

public class Square extends Rectangle {
	private Point vertex;
	private int sideLength;

	public Square(Point vertex, int sideLength) {
		super(vertex, new Point(vertex.getX() + sideLength, vertex.getY() - sideLength));
		this.vertex = vertex;
		this.sideLength = sideLength;
	}
}
