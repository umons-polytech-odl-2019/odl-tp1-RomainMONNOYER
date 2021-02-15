package exercise3;

public class ConvexPolygon {
	private Point vertices[];

	public ConvexPolygon(Point[] vertices) {
		this.vertices = vertices;
	}

	private double areaTriangle(Point A, Point B, Point C) {
		return (Math.abs((A.getX()-C.getX()) * (B.getY() - C.getY()) - (A.getY() - C.getY()) * (B.getX() - C.getX())) / 2);
	}

	public double perimeter() {
		double perimeter = 0;
		for (int i = 0; i < vertices.length; ++i) {
			if (i + 1 == vertices.length)
				perimeter += vertices[i].distanceTo(vertices[0]);
			else
				perimeter += vertices[i].distanceTo(vertices[i+1]);
		}
		return perimeter;
	}

	public double area() {
		double area = 0;
		Point center = new Point(0, 0);
		for (Point i : vertices) {
			center.setX(center.getX() + i.getX());
			center.setY(center.getY() + i.getY());
		}
		center.setX(center.getX() / vertices.length);
		center.setY(center.getY() / vertices.length);

		for (int i = 0; i < vertices.length; ++i) {
			if (i+1 != vertices.length)
				area += areaTriangle(vertices[i], vertices[i + 1], center);
			else
				area += areaTriangle(vertices[i], vertices[0], center);
		}
		return area;
	}
}
