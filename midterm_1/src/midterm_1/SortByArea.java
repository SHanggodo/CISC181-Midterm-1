package midterm_1;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid> {

	@Override
	public int compare(Cuboid arg1, Cuboid arg2) {

		if (arg1.area() > arg2.area()) {
			return 1;
		} else if (arg1.area() < arg2.area()) {
			return -1;
		} else {
			return 0;
		}

	}
}
