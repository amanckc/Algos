package algos;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import algos.*;
class TestNQueens {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPrintSolution() {
		//fail("Not yet implemented");
	}

	@Test
	void testIsSafe() {
	//	fail("Not yet implemented");
	}

	@Test
	void testSolveBoard() {
		NQueens test_obj = new NQueens();
		int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		// boolean expected=true;

		assertTrue("solution exists", test_obj.solveBoard(board, 0));
	}

	@Test
	void testSolveNQ() {
		//fail("Not yet implemented");
	}//

	@Test
	void testMain() {
		//fail("Not yet implemented");
	}

}
