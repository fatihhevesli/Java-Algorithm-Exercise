package ValidParantheses;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
        System.out.println(isValid("()"));
        System.out.println(isValid("{}[]()"));
        System.out.println(isValid("(}"));
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
