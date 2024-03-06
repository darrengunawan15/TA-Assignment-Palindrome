import java.util.*;

public class Palindrome {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");

        String inputStr = scanner.nextLine().toLowerCase();

        boolean result = isPalindrome(inputStr);

        System.out.println("\nOutput: " + result);
    }

    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> tempStack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            tempStack.push(s.charAt(i));
            queue.add(s.charAt(i));
        }

        printAll(tempStack, queue);

        for (int j = 0; j < s.length(); j++) {
            if (!(stack.pop() == queue.remove())) {
                return false;
            }
        }

        return true;
    }

    public static void printAll(Stack<Character> stack, Queue<Character> queue) {
        System.out.print("Stack values: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.print("\nQueue values: ");
        for (Character c : queue) {
            System.out.print(c + " ");
        }
    }
}