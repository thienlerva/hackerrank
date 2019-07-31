package algebraicExpression;

import java.util.Stack;

public class PoishExpression {

    public static void main(String[] args) {
        System.out.println(calculator("045+/"));
    }

    static int calculator(String input) {
        Stack<Integer> numStack = new Stack<>();
        int total=0;
        int index = 0;

        while (index<input.length()) {
            char c = input.charAt(index);
            if (Character.isDigit(c)) {
                numStack.push(Integer.parseInt(String.valueOf(c)));
            } else {
                total = calculateStack(c, numStack.pop(), numStack.pop());
                numStack.push(total);
            }
            index++;
        }
        return total;
    }
    static int calculateStack(char c, int num1, int num2) {
        try {
            switch (c) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case 'x':
                    return num1 * num2;
                case '/':
                    return num1 / num2;
                default:
                    throw new IllegalArgumentException("Can calculate");
            }
        } catch (ArithmeticException e) {
            System.out.println("can't not 0");
        }
        throw new IllegalArgumentException("Error");
    }
}
