public class searchAlgo{

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
    
    public static void main (String[]args){
        int[] arr =  { 1, 2, 3 };
        int result = findMax(arr);
        System.out.println(result + " is the Max number");
    }
    

}