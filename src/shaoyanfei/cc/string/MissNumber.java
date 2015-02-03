package shaoyanfei.cc.string;

public class MissNumber {

	public static int missNumber(String s) {
		int len = s.length();
		for (int i = 1; i < len / 2 + 1; i++) {
			int first = Integer.parseInt(s.substring(0, i));
			int next = Integer.parseInt(s.substring(i, i + i));
			if (next - first == 1) {
				int j = i;
				for (; j < len; j++) {
					int f_num = Integer.parseInt(s.substring(j, j + i));
					int n_num = Integer.parseInt(s.substring(i + j, i + j + i));
					int c_num = Integer.MAX_VALUE;
					if ((i + j + i + 1) < len)
						c_num = Integer.parseInt(s.substring(i + j, i + j + i
								+ 1));
					if (n_num - f_num == 2)
						return n_num - 1;
					if (c_num - f_num == 2)
						return c_num - 1;
				}
				if (j == len)
					return Integer.MAX_VALUE;
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missNumber("12345678911"));
		System.out.println(missNumber("9899101"));
		System.out.println(missNumber("9989991001"));
		System.out.println(missNumber("624625627"));
		System.out.println(missNumber("12356789"));
	}

}
