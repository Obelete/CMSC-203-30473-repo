import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook grade1;
	private GradeBook grade2;
	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(24);
		grade2 = new GradeBook(24);
		grade1.addScore(67);
		grade1.addScore(73);
		grade2.addScore(83);
		grade2.addScore(97);
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
	}
	@Test
	void testAddScore() {
		assertTrue(grade1.toString().equals("67.0 73.0 "));
		assertTrue(grade2.toString().equals("83.0 97.0 "));
		//fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(140,grade1.sum(),0.001);
		assertEquals(180,grade2.sum(),0.001);
		//fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		assertEquals(67,grade1.minimum(),0.001);
		assertEquals(83,grade2.minimum(),0.001);
		//fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		assertEquals(73,grade1.finalScore(),0.001);
		assertEquals(97,grade2.finalScore(),0.001);
		//fail("Not yet implemented");
	}

}
