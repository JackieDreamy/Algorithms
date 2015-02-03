package shaoyanfei.cc.math;

public class FindTheSum {

	// O(n) version
	public static int findSum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return sum;
	}

	// O(1) version
	public static int findSums(int num) {
		num--;
		int div3 = num / 3;
		div3 = (div3 * (div3 + 1)) / 2 * 3;
		int div5 = num / 5;
		div5 = (div5 * (div5 + 1)) / 2 * 5;
		int div15 = num / 15;
		div15 = (div15 * (div15 + 1)) / 2 * 15;
		return div3 + div5 - div15;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSum(10));
		System.out.println(findSums(10));
	}

}
