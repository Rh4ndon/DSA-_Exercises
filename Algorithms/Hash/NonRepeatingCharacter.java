import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingCharacter {

    
    

    public static Character findFirstNoneRepeatingCharacter(String s) {
         HashMap<Character, Integer> charCounts = new HashMap <Character, Integer>(); 
         for (char c : s.toCharArray()) {
             if (charCounts.containsKey(c)) {
                int count = charCounts.get(c);
                charCounts.put(c, count + 1);
             }
             else {
                charCounts.put(c,1);
             }
            }
        
        for (char c : s.toCharArray()){
            if (charCounts.get(c)==1){
                return c;
            }

        }

        return null;


    }

    public static void main(String args[]){
        // Create a scanner object to read user input 
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Characters:"); 
    String s = scanner.nextLine(); 
    
        findFirstNoneRepeatingCharacter(s);
        
        
    }
}