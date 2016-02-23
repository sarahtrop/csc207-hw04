/*
 * Testing functions written in Program.java
 * No test written for allPairs.
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
	public void fastExpTest() {
		assertEquals("2^0 = 1", 1, Program.fastExp(2, 0));
		assertEquals("2^1 = 2", 2, Program.fastExp(2, 1));
		assertEquals("2^2 = 4", 4, Program.fastExp(2, 2));
		assertEquals("2^6 = 64", 64, Program.fastExp(2, 6));
		assertEquals("2^8 = 256", 256, Program.fastExp(2, 8));
	}

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

	@Test
	public void unboundedModeTest() {
		int[] modeArr = {100, 400, 5, 600, 600, 600, 100, 200};
		int[] modeArr2 = {200, 200, 200, 500, 700, 200, 700, 700};
		assertEquals("Mode of {100, 400, 5, 600, 600, 600, 100, 200}: 600", 600, Program.unboundedMode(modeArr));
		assertEquals("Mode of {200, 200, 200, 500, 700, 200, 700, 700}: 200", 200, Program.unboundedMode(modeArr2));	
	}
	
}
