package midterm_1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(3, 4);
		System.out.println("Rectangle --------");
		System.out.println("Width: " + r1.getiWidth());
		System.out.println("Length: " + r1.getiLength());
		System.out.println("Area: " + r1.getiWidth() + " * " + r1.getiLength() + " = " + r1.area());
		System.out.println("Perimeter: " + r1.perimeter());

		Rectangle r2 = new Rectangle(1, 4);
		Rectangle r3 = new Rectangle(2, 4);
		Rectangle r4 = new Rectangle(3, 4);
		Rectangle r5 = new Rectangle(4, 4);

		ArrayList<Rectangle> recList = new ArrayList<Rectangle>();
		recList.add(r5);
		recList.add(r4);
		recList.add(r3);
		recList.add(r2);

		System.out.println();
		System.out.println("Area list: compareto ------");
		System.out.println("Original");
		for (int i = 0; i < recList.size(); i++) {
			System.out.print(recList.get(i).area() + ", ");
		}
		System.out.println();
		;

		Collections.sort(recList);

		System.out.println("Sorted");
		for (int i = 0; i < recList.size(); i++) {
			System.out.print(recList.get(i).area() + ", ");
		}
		System.out.println();
		System.out.println();

		Cuboid c1 = new Cuboid(3, 4, 5);
		System.out.println("Cuboid --------");
		System.out.println("Width: " + c1.getiWidth());
		System.out.println("Length: " + c1.getiLength());
		System.out.println("Depth: " + c1.getiDepth());
		System.out.println("Area: " + c1.getiWidth() + " * " + c1.getiLength() + " = " + c1.area());
		System.out.println("Volume: " + c1.volume());
		// System.out.println("Perimeter: " + c1.perimeter());

		Cuboid c2 = new Cuboid(3, 4, 5);
		Cuboid c3 = new Cuboid(3, 4, 4);
		Cuboid c4 = new Cuboid(3, 4, 3);
		Cuboid c5 = new Cuboid(3, 4, 2);

		ArrayList<Cuboid> cubList = new ArrayList<Cuboid>();
		cubList.add(c2);
		cubList.add(c3);
		cubList.add(c4);
		cubList.add(c5);

		System.out.println();
		System.out.println("Volume List compare -----");
		System.out.println("Original Volume");
		for (int i = 0; i < cubList.size(); i++) {
			System.out.print(cubList.get(i).volume() + ", ");
		}
		System.out.println();

		System.out.println("Original Area");
		for (int i = 0; i < cubList.size(); i++) {
			System.out.print(cubList.get(i).area() + ", ");
		}
		System.out.println();
		System.out.println();

		Collections.sort(cubList, new SortByVolume());
		System.out.println("Sorted Volume");
		for (int i = 0; i < cubList.size(); i++) {
			System.out.print(cubList.get(i).volume() + ", ");
		}
		System.out.println();

		Collections.sort(cubList, new SortByArea());
		System.out.println("Sorted Area");
		for (int i = 0; i < cubList.size(); i++) {
			System.out.print(cubList.get(i).area() + ", ");
		}
		System.out.println();

	}
}
