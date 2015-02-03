package shaoyanfei.cc.stack;

import java.util.Stack;

public class CalculateMathematicalExpression {

	public static int calculate(String expression) {
		Stack<Integer> number = new Stack<Integer>();
		Stack<Character> token = new Stack<Character>();
		String numstr = "";
		for (int i = 0; i < expression.length(); i++) {
			char current = expression.charAt(i);
			if (current == '+' || current == '-' || current == '*'
					|| current == '/') {
				if (numstr != "")
					number.add(Integer.parseInt(numstr));
				numstr = "";
				if (!token.empty()) {
					current = token.peek();
					if (current == '*' || current == '/') {
						if (number.size() >= 2
								&& number.size() == token.size() + 1) {
							int number2 = number.pop();
							int number1 = number.pop();
							if (current == '*') {
								number.add(number1 * number2);
							} else {
								number.add(number1 / number2);
							}
							token.pop();
						}
					}
				}
				token.add(expression.charAt(i));
			} else {
				numstr += current + "";
			}
		}
		if (numstr != "")
			number.add(Integer.parseInt(numstr));
		if (!token.empty()) {
			char current = token.peek();
			if (current == '*' || current == '/') {
				if (number.size() >= 2 && number.size() == token.size() + 1) {
					int number2 = number.pop();
					int number1 = number.pop();
					if (current == '*') {
						number.add(number1 * number2);
					} else {
						number.add(number1 / number2);
					}
					token.pop();
				}
			}
		}
		char current;
		while (!token.empty()) {
			int number2 = number.pop();
			int number1 = number.pop();
			current = token.pop();
			if (current == '+') {
				number.add(number1 + number2);
			} else {
				number.add(number1 - number2);
			}
		}
		return number.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculate("3+12*3-4/7"));
	}

}
