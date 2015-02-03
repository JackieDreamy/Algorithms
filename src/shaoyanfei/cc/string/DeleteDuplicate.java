package shaoyanfei.cc.string;

import java.util.Stack;

/*
 * Given a string, complete the given function to recursively remove the adjacent duplicate characters and return the resultant string. If there are no characters left in the resultant string, return "-1" (without quotes). 
 Sample Test Cases 
 Sample Input: ABCCBCBA 
 Output: ACBA 

 Explanation: (ABCCBCBA --> ABBCBA --> ACBA) 
 Sample Input: AA 
 Sample Output: -1 
 Java solution
 */
public class DeleteDuplicate {

	public static String deleteDuplicate(String str) {
		if (str.length() == 0)
			return "-1";
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		stack.add(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (stack.peek() == str.charAt(i)) {
				stack.pop();
				continue;
			} else {
				stack.add(str.charAt(i));
			}
		}
		if (stack.empty())
			return "-1";
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deleteDuplicate("ABCCBCBA"));
		System.out.println(deleteDuplicate("AA"));
	}

}
