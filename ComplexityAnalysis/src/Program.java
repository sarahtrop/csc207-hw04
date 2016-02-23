import java.lang.IllegalArgumentException;

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
	 * @return	an integer
	 */
	public static int fastExp(int x, int y) {
		int exp = x;
		if (y == 0) { return 1; }
		else if (y == 1) { return exp; }
		else {
			if (y % 2 == 0) {
				return fastExp(exp*exp, y/2);
			} else {
				return fastExp(exp*exp*exp, (y-1)/2);
			}
		}
	}

	/**
	 * Problem 3: All Pairs
	 * Method that takes an integer array and returns and array of pairs
	 * containing all possible pairs, including each element with itself.
	 * 
	 * @param arr	an array of integers
	 * @return		an array of pairs
	 * @throws IllegalArgumentException
	 */
	public static Pair[] allPairs(int[] arr) throws IllegalArgumentException{
		int length = arr.length;
		Pair[] pairArr = new Pair[length];
		
		for (int i=0; i<length; i++) {
			for (int j = i; j<length; j++) {
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
	 * @throws IllegalArgumentException
	 */
	public static int boundedMode(int[] arr) throws IllegalArgumentException {
		int[] aux = new int[arr.length];
		for (int j=0; j<arr.length; j++) {
			int count = 0;
			for (int i=0; i<arr.length; i++) {
				if (arr[j] == arr[i]) { count++; }
				aux[j] = count;
			}
		}
		int maxFreq = max(aux);
		int[] repeats = new int[arr.length];
		for (int k=0; k<aux.length; k++) {
			if(aux[k] == maxFreq) { repeats[k] = arr[k]; }
			// Because the bounds are 0-100
			// There will never be an input value equal to or greater than 101
			else { repeats[k] = 101; } 
		}
		return min(repeats);
	}
	
	/**
	 * Method takes an array of integers and returns the maximum integer in the array.
	 * 
	 * @param arr	an array of integers
	 * @return		an integer
	 * @throws IllegalArgumentException
	 */
	public static int max(int[] arr) throws IllegalArgumentException {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(arr[i], max);
		}
		return max;
	}
	
	/**
	 * Method takes an array of integers and returns the minimum integer in the array.
	 * 
	 * @param arr	an array of integers
	 * @return		an integer
	 * @throws IllegalArgumentException
	 */
	public static int min(int[] arr) throws IllegalArgumentException {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(arr[i], min);
		}
		return min;
	}

	/**
	 * Problem 5 continued
	 * Method that takes an array of integers and returns
	 * the mode, or the most frequent integer, in the array.
	 * 
	 * @param arr	an array of integers
	 * @return		an integer
	 * @throws IllegalArgumentException
	 */
	public static int unboundedMode(int[] arr) throws IllegalArgumentException {
		int[] aux = new int[arr.length];
		for (int j=0; j<arr.length; j++) {
			int count = 0;
			for (int i=0; i<arr.length; i++) {
				if (arr[j] == arr[i]) { count++; }
				aux[j] = count;
			}
		}
		int maxFreq = max(aux);
		int repInt = 0;
		for (int k=0; k<aux.length; k++) {
			if(aux[k] == maxFreq) { repInt++; }
		}
		int[] repeats = new int[repInt/maxFreq];
		int index = 0;
		for (int m=0; m<arr.length; m++) {
			if(aux[m] == maxFreq && !inArray(repeats, arr[m])) {
				repeats[index] = arr[m];
				index++;
			}
		}
		return min(repeats);
	}
	
	/**
	 * Method takes and array of integers and and integer and 
	 * returns true if the integer is in the array.
	 * Otherwise it returns false.
	 * 
	 * @param arr	an array of integers
	 * @param n		an integer
	 * @return		a boolean
	 */
	public static boolean inArray(int[] arr, int n) {
		for (int i=0; i<arr.length; i++) {
			if (n == arr[i]) { return true; }
		}
	    return false;
	}
	
	public static void main(String[] args) {
	}

}
