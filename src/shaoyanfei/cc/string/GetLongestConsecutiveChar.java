package shaoyanfei.cc.string;

import java.util.ArrayList;
import java.util.List;

public class GetLongestConsecutiveChar {
	private static List<Character> getLongestConsecutiveChar(String s) {
		int max = 0;
		int len = 1;
		List<Character> res = new ArrayList<Character>();
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ') {
				len = 1;
				continue;
			}
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				len++;
				i++;
			}
			if (len > max) {
				res.clear();
				res.add(s.charAt(i));
				max = len;
			} else if (len == max) {
				res.add(s.charAt(i));
			}
			len = 1;
		}
		return res;
	}

	public static void main(String[] args) {
		String s1 = "this is a test sentence";
		String s2 = "thiis iss a teest seentennce";
		String s3 = "thiiis iss aa teeest seentennnce";
		String s4 = "thiiiis iss a teeest seeentennncccce";
		System.out.println(getLongestConsecutiveChar(s1));
		System.out.println(getLongestConsecutiveChar(s2));
		System.out.println(getLongestConsecutiveChar(s3));
		System.out.println(getLongestConsecutiveChar(s4));
	}

}
