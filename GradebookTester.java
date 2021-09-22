import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	
	
	private GradeBook g1;
	private GradeBook g2;
	private GradeBook g3;

	@BeforeEach
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g3 = new GradeBook(5);

		g1.addScore(85);
		g1.addScore(90);
		
		g2.addScore(70);
		g2.addScore(95);
		
		g3.addScore(50);
		g3.addScore(80);
	System.out.println(g1);

	}

	@AfterEach
	public void tearDown() throws Exception {
		g1 =null;
		g2 =null;
		g3 =null;
	}

	@Test
	public void addScoreTest() {
		assertEquals(g1.toString(),("85.0 90.0 0.0 0.0 0.0 "));
		assertEquals(g2.toString(),("70.0 95.0 0.0 0.0 0.0 "));
		assertEquals(g3.toString(),("50.0 80.0 0.0 0.0 0.0 "));
		
		assertEquals(2,g1.getScoreSize(),.001);
	    assertEquals(2,g2.getScoreSize(),.001);
	    assertEquals(2,g3.getScoreSize(),.001);
	    
	}
	
	@Test
	public void testSum() {
		assertEquals(175, g1.sum(),.0001);
		assertEquals(165, g2.sum(),.0001);
		assertEquals(130, g3.sum(),.0001);
	}
	
	@Test
	public void testMinimum() {
		assertEquals(85, g1.minimum(),.001);
		assertEquals(70, g2.minimum(),.001);
		assertEquals(50, g3.minimum(),.001);
	}

	@Test
	public void TestfinalScore() {
		assertEquals(90, g1.finalScore(),.001);
		assertEquals(95, g2.finalScore(),.001);
		assertEquals(80, g3.finalScore(),.001);
	}
}
