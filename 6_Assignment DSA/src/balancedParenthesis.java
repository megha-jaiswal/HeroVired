import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {

    public static boolean checkBalanced(String expressions) {
        Stack<Character> items = new Stack<>();
        for (char character : expressions.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                items.push(character);
            } else if (character == ')' || character == '}' || character == ']') {
                if (items.isEmpty())
                    return false;
                char top = items.pop();
                if (match(top, character))
                    return true;
            }
        }
        return false;
    }

    public static boolean match(char opening, char closing) {

        return (opening == '{' && closing == '}' || opening == '(' && closing == ')' || opening == '[' && closing == ']');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expressions : ");
        String expressions = sc.nextLine();
        if (checkBalanced(expressions)) {
            System.out.println("Expressions is balanced.");
        } else {
            System.out.println("Expressions is not balanced.");
        }
    }
}