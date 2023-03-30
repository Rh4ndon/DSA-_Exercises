import java.util.Stack;

public class StackLesson {
    public static void main(String[] args) {
        Stack<String> person= new Stack<>();

        // Add elements to Stack
        person.push("Alice");
        person.push("Bob");
        person.push("Charlie");

        System.out.println("Initial Stack: " + person);

        // Remove element stacks
        String element = person.pop();
        System.out.println("Removed Element: " + element);

        // Removing all elements
        String second = person.pop();
        String all = person.pop();
        

        // Check if stack is empty
        boolean result = person.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
