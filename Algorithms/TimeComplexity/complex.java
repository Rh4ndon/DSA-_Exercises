public class complex{

public static int sum (int[] arr) {
      
    int sum = 0;
    
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
  
 
    }
 return sum;

}

public static void main (String[] args) {
     int[] arr = { 1, 2, 3,5,6,10 };
     int result = sum(arr);
     System.out.println("The sum of the array is " + result);
}
}