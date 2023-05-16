public class Fibonacci{

        public static int fibonacci(int n) {
            if (n < 2) { //base cas
                return n;
            }
            else { //recursive case
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }

        public static void main (String[]args){
            int n = 10;
            int result = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is " + result);
        }
}