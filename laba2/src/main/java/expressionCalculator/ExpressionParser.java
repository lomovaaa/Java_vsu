package expressionCalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExpressionParser {
    private static final String operationVariants = "+-*/^";
    private static Map<String, Integer> operationPriorities = new HashMap<String,Integer>();
    private Stack<Integer> operands;
    private Stack<String> operations;

    public ExpressionParser() {
        for(int i = 0; i < operationVariants.length(); i++) {
            char operation = operationVariants.charAt(i);
            switch (operation) {
                case '+':
                case '-':
                    operationPriorities.put(String.valueOf(operation), 1);
                    break;
                case '*':
                case '/':
                    operationPriorities.put(String.valueOf(operation), 2);
                    break;
                case '^':
                    operationPriorities.put(String.valueOf(operation), 3);
                    break;
            }
        }
    }

    private boolean isOperation() {
        return true;
    }

    private boolean isOperand() {
        return true;
    }

    private boolean isFunction() {
        return true;
    }

    private boolean isParametr() {
        return true;
    }

    public void parsing(String expression) {

    }
}
