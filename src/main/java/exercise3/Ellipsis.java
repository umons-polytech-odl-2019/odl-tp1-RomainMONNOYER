package exercise3;

public class Ellipsis {
	private Point center;
	private int xAxisLength;
	private int yAxisLength;

	public Ellipsis(Point center, int x, int y) {
		this.xAxisLength = x;
		this.yAxisLength = y;
		this.center = center;
	}

	public double perimeter() {
		return 2 * Math.PI * Math.sqrt((Math.pow(xAxisLength, 2) + Math.pow(yAxisLength, 2)) / 2);
	}

	public double area() {
		return Math.PI * xAxisLength * yAxisLength;
	}
}
