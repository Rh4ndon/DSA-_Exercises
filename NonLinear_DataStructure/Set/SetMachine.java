import java.util.HashSet; 
import java.util.Set; 

public class SetMachine { 
    public static void main (String[] ars) {
    // Declare a  Set of integer "numbers"
     Set<Integer> numbers = new HashSet<>();
      
    //Add some integers to the set 
    numbers.add(2); 
    numbers.add(3); 
    numbers.add(5); 
    numbers.add(7); 
    // Declare an integer variable called "sue and initialize it to 
    int sum = 0;
    // Loop through the Set and add each integer to the sum variable 
    for (int number : numbers) {
         sum += number; 
    // Print the value of "sum" 
    System.out.println("The sum is " + sum);
    }




}


}
