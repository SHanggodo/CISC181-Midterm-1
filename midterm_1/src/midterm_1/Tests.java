package midterm_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void testRecConstructor() {
		Rectangle r1 = new Rectangle(3, 4);
		assertTrue(r1 instanceof Rectangle);
	}

	@Test
	void testRecGetWidth() {
		Rectangle r1 = new Rectangle(3, 4);
		assertEquals(r1.getiWidth(), 3);
	}

	@Test
	void testRecGetLength() {
		Rectangle r1 = new Rectangle(3, 4);
		assertEquals(r1.getiLength(), 4);
	}

	@Test
	void testRecSetWidth() {
		Rectangle r1 = new Rectangle(3, 4);
		r1.setiWidth(5);
		assertEquals(r1.getiWidth(), 5);
	}

	@Test
	void testRecSetLength() {
		Rectangle r1 = new Rectangle(3, 4);
		r1.setiLength(5);
		assertEquals(r1.getiLength(), 5);
	}

	@Test
	void testRecArea() {
		Rectangle r1 = new Rectangle(3, 4);
		assertTrue(r1.area() == 12);
	}

	@Test
	void testRecPerimeter() {
		Rectangle r1 = new Rectangle(3, 4);
		assertTrue(r1.perimeter() == 14);
	}

	@Test
	void testRecCompareTo() {
		Rectangle rLarger = new Rectangle(3, 4);
		Rectangle rSmaller = new Rectangle(1, 1);
		assertTrue(rLarger.compareTo(rSmaller) == 1);
		assertTrue(rSmaller.compareTo(rLarger) == -1);
		assertTrue(rSmaller.compareTo(rSmaller) == 0);
	}

	@Test
	void testCubConstructer() {
		Cuboid c1 = new Cuboid(3, 4, 5);
		assertTrue(c1 instanceof Cuboid);
	}

	@Test
	void testCubGetWidth() {
		Cuboid c1 = new Cuboid(3, 4, 5);
		assertEquals(c1.getiWidth(), 3);
	}

	@Test
	void testCubGetLength() {
		Cuboid c1 = new Cuboid(3, 4, 5);
		assertEquals(c1.getiLength(), 4);
	}

	@Test
	void testCubGetDepth() {
		Cuboid c1 = new Cuboid(3, 4, 5);
		assertEquals(c1.getiDepth(), 5);
	}

	@Test
	void testCubSetWidth() {
		Cuboid c1 = new Cuboid(3, 4, 5);
		c1.setiWidth(6);
		assertEquals(c1.getiWidth(), 6);
	}

	@Test
	void testCubSetLength() {
		Cuboid c1 = new Cuboid(3, 4, 5);
		c1.setiLength(6);
		assertEquals(c1.getiLength(), 6);
	}

	@Test
	void testCubSetDepth() {
		Cuboid c1 = new Cuboid(3, 4, 5);
		c1.setiDepth(6);
		assertEquals(c1.getiDepth(), 6);
	}

	@Test
	void testCubArea() {
		Cuboid c1 = new Cuboid(3, 4, 5);
		assertTrue(c1.area() == 94);
	}

	@Test
	void testCubPerimeter() {
		boolean thrown = false;
		Cuboid c1 = new Cuboid(3, 4, 5);
		try {
			c1.perimeter();
		} catch (UnsupportedOperationException e) {
			thrown = true;
		}

		assertTrue(thrown);
	}

	@Test
	void testSortByArea() {
		Cuboid cLarger = new Cuboid(4, 5, 6);
		Cuboid cSmaller = new Cuboid(1, 2, 3);
		SortByArea comp = new SortByArea();
		assertEquals(comp.compare(cLarger, cSmaller), 1);
	}

	@Test
	void testSortByVolume() {
		Cuboid cLarger = new Cuboid(4, 5, 6);
		Cuboid cSmaller = new Cuboid(1, 2, 3);
		SortByVolume comp = new SortByVolume();
		assertEquals(comp.compare(cLarger, cSmaller), 1);
	}

}
