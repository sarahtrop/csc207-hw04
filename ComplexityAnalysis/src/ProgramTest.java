/*
 * Testing functions written in Program.java
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class ProgramTest {
	@Test
	public void containsTest() {
		double[] doubleArr = {0.2, 0.3, 0.5, 0.9, 1.4};
		assertEquals("|1.6 - 1.4| < 0.2: true", true, Program.contains(doubleArr, 0.3, 1.6));
		assertEquals("|0.3 - 0.5| < 0.4: true", true, Program.contains(doubleArr, 0.2, 0.3));
	}
			
	@Test
	public void fastExtTest() {
		assertEquals("2^3 = 8", 8, Program.fastExp(2, 3));
		assertEquals("2^4 = 16", 16, Program.fastExp(2, 4));
		assertEquals("2^6 = 64", 64, Program.fastExp(2, 6));
	}
	/*
	 * ASK PM ABOUT TESTING THIS FUNCTION
	@Test
	public void allPairsTest() {
		int[] pairArr = {3, 5, 9};
		int[] pairArr2 = {1, 4, 6, 8};
		Pair[] returnPairs = {(3, 3), (3, 5), (3, 9), (5, 3), (5, 5), (5, 9), (9, 3), (9, 5), (9, 9)};
		Pair[] returnPairs2 = {(1, 1), (1, 8), (8, 1), (8, 8)};
				
		assertEquals("{3, 5, 9} pairs: {(3, 3), (3, 5), (3, 9), (5, 3), (5, 5), (5, 9), (9, 3), (9, 5), (9, 9)}", returnPairs, Program.allPairs(pairArr));
		assertEquals("{1, 8} pairs: {(1, 1), (1, 8), (8, 1), (8, 8)}", returnPairs2, Program.allPairs(pairArr2));
	}
	*/
	@Test
	public void concatAndReplicateTest() {
		String[] stringArr = {"hello", "world", "!"};
		String[] stringArr2 = {"Hey", "PM", "what's", "up", "?"};
		assertEquals("hello world! -> hellohellohellohelloworldworldworldworld!!!!", "hellohellohellohelloworldworldworldworld!!!!", Program.concatAndReplicateAll(stringArr, 4));
		assertEquals("Hey PM what's up? -> HeyHeyPMPMwhat'swhat'supup??", "HeyHeyPMPMwhat'swhat'supup??", Program.concatAndReplicateAll(stringArr2, 2));
	}

	@Test
	public void boundedModeTest() {
		int[] modeArr = {1, 4, 5, 6, 6, 6, 1};
		int[] modeArr2 = {2, 2, 2, 5, 7, 2, 7, 7};
		assertEquals("Mode of {1, 4, 5, 6, 6, 6, 1}: 6", 6, Program.boundedMode(modeArr));
		assertEquals("Mode of {2, 2, 2, 5, 7, 2, 7, 7}: 2", 2, Program.boundedMode(modeArr2));	
	}
	/*
	@Test
	public void unboundedModeTest() {
		int[] modeArr = {100, 400, 5, 600, 600, 600, 100, 200};
		int[] modeArr2 = {200, 200, 200, 500, 700, 200, 700, 700};
		assertEquals("Mode of {100, 400, 5, 600, 600, 600, 100, 200}: 600", 600, Program.unboundedMode(modeArr));
		assertEquals("Mode of {200, 200, 200, 500, 700, 200, 700, 700}: 200", 200, Program.unboundedMode(modeArr2));	
	}
*/
}
