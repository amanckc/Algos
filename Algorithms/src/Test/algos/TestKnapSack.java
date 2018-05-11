package algos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import algos.KnapSack;
class TestKnapSack {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMaximum() {
		//fail("Not yet implemented");
	}

	@Test
	void testFindSolution() {
		//fail("Not yet implemented");
		
		int val[] = { 12, 20, 10, 34, 40 };
		int weights[] = { 10, 20, 25, 15, 30 };

		int max_wt = 50;
		int n = val.length;
		KnapSack test_obj = new KnapSack();
		assertEquals(74, test_obj.findSolution(val, weights, max_wt, n), "solution exits");
	}

	@Test
	void testMain() {
		//fail("Not yet implemented");
	}

}
