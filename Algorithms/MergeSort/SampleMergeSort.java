public class SampleMergeSort {
 
    public static int[] merge(int[]A, int[]B){
    
        int i = 0; // index for array A 
        int j = 0; // index for array B  
        int[] C = new int[A.length + B.length]; // create a nem array for the merged result 
    // compare elements from A and B and add the yeller one to C 
    while (i < A.length && j < B.length){
         if (A[i] < B[j]) { 
            C[i + j] = A[i];
          } else {
            C[i + j] = B[j]; 
            j++;
          }
         }
    // add any remaining elements from A to C 
    while (i < A.length) {
        C[i + j] = A[i];
        i++;
    }  
    // add any remaining elements from B to C 
    while (j < B.length) {
        C[i + j] = B[j];
        j++;
    }
    
    return C;
    }
    public static void main(String args[]){
        int[] A = { 1, 2, 3 };
        int[] B = { 4, 5, 6} ;
        
        int[] result = merge(A, B);
        System.out.println(result); 
    }
    
}









