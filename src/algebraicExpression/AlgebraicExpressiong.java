package algebraicExpression;

import java.util.Stack;

public class AlgebraicExpressiong {

    public static void main(String[] arg) {
        System.out.println(evaluate("(10/2) + (2 * 6)"));
        System.out.println(evaluate("1 * 2 + 12"));
        System.out.println(evaluate("1 * ( 2 + 1 )"));
        System.out.println(evaluate("100 * ( 2 + 12 ) / 14"));

        final int num = 1/2;
        System.out.println(num);
    }

    public static int evaluate(String expression)
    {

        expression = expression.replaceAll(" ", "");
        // Stack for numbers: 'values'
        Stack<Integer> values = new Stack<Integer>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        int length = expression.length();
        int pos = 0;
        Character token;

        while (length > pos)
        {

            token = expression.charAt(pos);
            pos++;
            // Current token is a number, push it to stack for numbers
            if (Character.isDigit(token))
            {
//                StringBuffer stringBuffer = new StringBuffer();
//
//                while(pos < length && Character.isDigit(token)) {
//                    stringBuffer.append(token);
//                    pos++;
//                    token = pos < length ? expression.charAt(pos) : null;
//
//                }
//                values.push(Integer.parseInt(stringBuffer.toString()));
//                continue;

                int start = pos-1;

                while (pos < expression.length() && Character.isDigit(expression.charAt(pos))) {

                    pos++;
                }
                String num = expression.substring(start, pos);
                values.push(Integer.parseInt(num));
            }

            // Current token is an opening brace, push it to 'ops'
            else if (token == '(')
                ops.push(token);

                // Closing brace encountered, solve entire brace
            else if (token == ')')
            {
                while (ops.peek() != '(')
                    values.push(evaluateTop(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }

            // Current token is an operator.
            else if (token == '+' || token == '-' ||
                    token == '*' || token == '/')
            {
                // While top of 'ops' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'ops'
                // to top two elements in values stack
//                while (!ops.empty() && hasPrecedence(token, ops.peek()))
//                    values.push(evaluateTop(ops.pop(), values.pop(), values.pop()));
                while (!ops.empty() && precedence(ops.peek()) >= precedence(token)) {
                    values.push(evaluateTop(ops.pop(), values.pop(), values.pop()));
                }

                // Push current token to 'ops'.
                ops.push(token);
            }


        }

        // Entire expression has been parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
            values.push(evaluateTop(ops.pop(), values.pop(), values.pop()));

        // Top of 'values' contains result, return it
        return values.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int precedence(char ch)
    {
        if (ch == '+' || ch == '-') { return 1; }
        else if (ch == '*' || ch == '/') { return 2; }
        else { return 0; }
    }

    // A utility method to apply an operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static int evaluateTop(char op, int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new ArithmeticException("Cannot divide by zero");
                return a / b;
            default: throw new IllegalArgumentException("Error");
        }
    }
}
