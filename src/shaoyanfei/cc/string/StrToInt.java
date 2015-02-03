package shaoyanfei.cc.string;

public class StrToInt {

	public int atoi(String str) {
		boolean neg = false; // flag to mark if the converted integer positive
								// or negative.
		StringBuilder buf = new StringBuilder(); // temp buffer to store the
													// converted string

		// check if the string is null or empty
		if (str == null || str.isEmpty())
			return 0;

		// trim the leading whitespaces
		str = str.trim();

		// if string contains only whitespace characters
		if (str.isEmpty())
			return 0;

		// get length of the trimed string
		int length = str.length();

		// Check if the first character of the string
		if (isNeg(str.charAt(0)))
			neg = true;
		else if (isPos(str.charAt(0)))
			neg = false;
		else if (Character.isDigit(str.charAt(0)))
			buf.append(str.charAt(0));
		else
			return 0;

		// check the first sequence of digit characters in the string
		int start = 1;
		while (start < length && Character.isDigit(str.charAt(start))) {
			buf.append(str.charAt(start));
			start++;
		}

		// check if the buf is empty
		if (buf.length() == 0)
			return 0;

		// check if the converted integer is overflowed
		long result;
		if (buf.length() <= 10) {
			result = toInteger(buf, neg);
		} else if (neg) {
			return Integer.MIN_VALUE;
		} else
			return Integer.MAX_VALUE;

		// Post-processing the convert long to int
		if (neg && result <= Integer.MAX_VALUE) {
			return 0 - (int) result;
		} else if (!neg && result <= Integer.MAX_VALUE) {
			return (int) result;
		} else if (neg && result > Integer.MAX_VALUE) {
			return Integer.MIN_VALUE;
		} else
			return Integer.MAX_VALUE;
	}

	private boolean isPos(char ch) {
		return ch == '+';
	}

	private boolean isNeg(char ch) {
		return ch == '-';
	}

	private long toInteger(StringBuilder buf, boolean neg) {
		int len = buf.length();
		long result = 0;
		for (int i = 0; i < len; i++) {
			result += Character.getNumericValue(buf.charAt(i))
					* Math.pow(10, len - i - 1);
		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
