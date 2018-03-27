package Submit;

import java.util.Stack;

public class FormulaEval {

	public  double eval(String formula) {

		String a[] = formula.split(" ");
		return calc(infix2Postfix(a));
	}

	public static double calc(Stack<String> input) {
		Stack<String> stack = new Stack<>();
		int a, b;
		for (int i = 0; i < input.size(); i++) {
			if (thePriority(input.get(i)) == 0) {
				stack.push(input.get(i));
			} else {
				b = Integer.parseInt(stack.pop());
				a = Integer.parseInt(stack.pop());
				if (input.get(i).equals("+")) {
					stack.push(String.valueOf(a+b));
				}if (input.get(i).equals("-")) {
					stack.push(String.valueOf(a-b));
				}if (input.get(i).equals("*")) {
					stack.push(String.valueOf(a*b));
				}if (input.get(i).equals("/")) {
					stack.push(String.valueOf(a/b));
				}
			}
		}

		return Double.parseDouble(stack.pop());
	}

	public static Stack<String> infix2Postfix(String[] infix) {
		Stack<String> stack = new Stack<>();
		Stack<String> output = new Stack<>();

		String pop;

		for (String token : infix) {
			if (thePriority(token) == 0) {
				if (token.equals("(")) {
					stack.push(token);
				} else {
					if (token.equals(")")) {
						pop = stack.pop();
						do {
							output.push(pop);
							pop = stack.pop();
						} while (!pop.equals("("));
					} else {
						output.push(token);
					}
				}
			} else {
				while (!stack.isEmpty() && thePriority(stack.peek()) >= thePriority(token)) {
					output.push(stack.pop());
				}
				stack.push(token);
			}
		}

		while (!stack.isEmpty()) {
			output.push(stack.pop());
		}

		return output;
	}

	public static int thePriority(String operator) {
		if (operator.equals("*") || operator.equals("/")) {
			return 2;
		}
		if (operator.equals("+") || operator.equals("-")) {
			return 1;
		}
		return 0;
	}
}
