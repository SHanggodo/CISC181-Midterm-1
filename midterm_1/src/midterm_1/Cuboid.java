package midterm_1;

public class Cuboid extends Rectangle {

	int iDepth;

	public Cuboid(int width, int length, int depth) {
		super(width, length);
		iDepth = depth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double volume() {
		double volume = iWidth * iLength * iDepth;
		return volume;
	}

	@Override
	public double area() {
		double sArea = 2 * (iLength * iWidth + iWidth * iDepth + iLength * iDepth);
		return sArea;
	}

	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

}
