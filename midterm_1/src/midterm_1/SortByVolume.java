package midterm_1;

import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid> {

	@Override
	public int compare(Cuboid o1, Cuboid o2) {

		if (o1.volume() > o2.volume()) {
			return 1;
		} else if (o1.volume() < o2.volume()) {
			return -1;
		} else {
			return 0;
		}
	}

}
