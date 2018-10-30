package midterm_1;

public class Rectangle extends Shape implements Comparable<Rectangle> {
	int iWidth;
	int iLength;

	public Rectangle(int width, int length) {
		super();
		iWidth = width;
		iLength = length;
	}

	public int getiWidth() {
		return iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	public double area() {

		double area = iWidth * iLength;

		return area;

	}

	public double perimeter() {

		double perimeter = 2 * iWidth + 2 * iLength;

		return perimeter;
	}

	@Override
	public int compareTo(Rectangle other) {
		if (this.area() > other.area()) {
			return 1;
		} else if (this.area() < other.area()) {
			return -1;
		} else {
			return 0;
		}

	}

}
