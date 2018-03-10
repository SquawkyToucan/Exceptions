package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(int dividend, int divisor) throws IllegalArgumentException {
		if(divisor == 0) {
			throw new IllegalArgumentException();
		}
		return dividend/divisor;
	}
	public String reverseString(String s) throws IllegalStateException {
		if(s == null) {
			throw new IllegalStateException();
		}
		String l = "";
		for(int i = s.length() - 1; i > -1; i--) {
			l = l + s.substring(i, i + 1);
		}
		return l;
	}
}
