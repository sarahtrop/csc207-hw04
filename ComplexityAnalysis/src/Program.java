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
<<<<<<< HEAD
		int mode = 0;
		int[] aux = new int[arr.length];
		int index = 0;

		for (int j=0; j<arr.length; j++) {
			int count = 0;
			for (int i=0; i<arr.length; i++) {
				if (arr[i] == mode) { count++; }
				aux[j] = count;
			}
			for (int k=0; k<aux.length; k++) {
				if (count == aux[k]) {
					if (arr[count] < arr[k]) { index = count; }
					else { index = k; }
				}
				else if (count > aux[k]) { index = k; }
			}
		} 
		mode = arr[index];
		return mode;
=======
		int[] aux = new int[arr.length];
		int count = 0;
		for (j=0; j<arr.length; j++) {
			int mode = arr[j];
			for (int i=0; i<arr.length; i++) {
				if (arr[i] == mode) { count++; }
				aux[i] = count;
			}
		}
		int max_freq = max(aux);
		int[] repeats = new int[arr.length];
		for (int k=0; k<aux.length; k++) {
			if(aux[k] == max_freq) { repeats[k] = arr[k]; }
		}
		return min(repeats);
	}
	
	public static int max(int[] arr) throws IllegalArgumentException {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(arr[i], max);
		}
		return max;
	}
	
	public static int min(int[] arr) throws IllegalArgumentException {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(arr[i], min);
		}
		return min;
>>>>>>> a685c0dabc91d677e699df3e82f29e8d8edf90da
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
