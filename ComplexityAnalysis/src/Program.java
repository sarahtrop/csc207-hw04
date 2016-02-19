
/* Sarah Trop
 * Homework 4: Complexity Analysis
 * 
 * Resources:
 * Help on writing Javadoc comments
 * http://www.oracle.com/technetwork/articles/java/index-137868.html
 */

public class Program {
	
	/**
	 * Method that returns true if there exists 
	 * a double d2 in arr for which |d1-d2| < eps
	 * Otherwise returns false
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
			for (int i = 2; i<y/2; i++) {
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
	
	public static void main(String[] args) {

	}

}