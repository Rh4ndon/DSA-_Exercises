import java.util.LinkedList;

public class LessonLinkedList {
    public static void main(String[] args){

        // create linkedlist
        LinkedList<String> fruits = new LinkedList<>();
    
        // Add elements to LinkedList
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println("LinkedList: " + fruits);
        fruits.add(0,"orange");
        System.out.println(fruits.get(0) + " will be added");
        System.out.println("LinkedList: " + fruits);
        System.out.println(fruits.remove(3) + " will be removed");
        System.out.println("LinkedList: " + fruits);
        System.out.println("I get " + fruits.get(1));
        System.out.println("The list size is " + fruits.size());
      }
}
