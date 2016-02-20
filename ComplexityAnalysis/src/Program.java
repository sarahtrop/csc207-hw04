import java.lang.IllegalArgumentException;
import java.util.Arrays;

public class Program {
	
	/**
	 * Problem 1: Contains
	 * Method that returns true if there exists 
	 * a double d2 in arr for which |d1-d2| < eps.
	 * Otherwise returns false.
	 * 
	 * @param arr 	an array of doubles
	 * @param eps	a double value
	 * @param d1	a double value
	 * @return 		a boolean
	 */
	public static boolean contains(double[] arr, double eps, double d1) {
		for(int i=0; i<arr.length; i++) {
			if (Math.abs(d1-arr[i]) < eps) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Problem 2: Fast Exponentiation
	 * Method that takes two integers, x and y, and returns x^y.
	 * 
	 * @param x	an integer
	 * @param y	an integer
	 * @return	an integer, the result of x^y
	 */
	public static int fastExp(int x, int y) {
		int exp = x*x;
		int remainExp;
		
		if (y == 0) { return 0; }
		else if (y == 1) { return x; }
		else {
			for (int i = 2; i<y; i++) {
				exp *= x;
				if (y % 2 == 0) {
					remainExp = y/2;
				} else {
					remainExp = (y-1)/2;
				}
			}	
		}
		return exp;
	}
	
	/**
	 * Problem 3: All Pairs
	 * Method that takes an integer array and returns and array of pairs
	 * containing all possible pairs, including each element with itself.
	 * 
	 * @param arr	an array of integers
	 * @return		an array of pairs
	 */
	public static Pair[] allPairs(int[] arr) throws IllegalArgumentException{
		Pair[] pairArr = new Pair[arr.length];
		
		for (int i=0; i<arr.length; i++) {
			for (int j = i; j<arr.length; j++) {
				Pair currPair = new Pair(arr[i], arr[j]);
				pairArr[i] = currPair;
			}
		}
		return pairArr;
	}
	
	/**
	 * Problem 4: Concat-Replicate
	 * Method that takes an array of strings and replicates each
	 * by n and then concatenates and returns one large string.
	 * 
	 * @param arr	an array of strings
	 * @param n		an integer
	 * @return		a string
	 */
	public static String concatAndReplicateAll(String[] arr, int n) {
		String ret = "";
		
		for (int i=0; i<arr.length; i++) {
			for (int j=1; j<n; j++) {
				ret += arr[i];
			}
			ret += arr[i];
		}
		
		return ret;
	}
	
	/**
	 * Problem 5: Mode
	 * Method that takes an array of integers and returns
	 * the mode, or the most frequent integer, in the array.
	 * 
	 * @param arr	an array of integers between 0 and 100
	 * @return		an integer
	 */
	public static int boundedMode(int[] arr) throws IllegalArgumentException {
		int mode = arr[0];
		int[] aux = new int[arr.length];
		int index = 0;
		
		for (int j=1; j<arr.length; j++) {
			int count = 0;
			if (arr[j] != arr[j-1]) {
				for (int i=0; i<arr.length; i++) {
					if (arr[i] == mode) {
						count++;
					}
					aux[j] = count;
				}
				for (int k=0; k<aux.length; k++) {
					if (count > aux[k]) { index = k; }
				}
			}
		}
		mode = arr[index];
		return mode;
	}
	
	/**
	 * Problem 5 continued
	 * Method that takes an array of integers and returns
	 * the mode, or the most frequent integer, in the array.
	 * 
	 * @param arr	an array of integers
	 * @return		an integer
	 */
	public static int unboundedMode(int[] arr) throws IllegalArgumentException {
		int mode = arr[0];
		
		return mode;
	}
	
	public static void main(String[] args) {
	}

}
