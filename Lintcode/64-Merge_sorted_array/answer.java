public class Solution {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int end = m+n-1;
        int indexA = m - 1;
        int indexB = n - 1;
        
        while(indexA  >= 0 && indexB >= 0){
            if(A[indexA] > B[indexB]){
                A[end--] = A[indexA--];
            }else{
                A[end--] = B[indexB--];
            }
        }
        
        while(indexA >= 0){
            A[end--] = A[indexA--];
        }
        
        while(indexB >= 0){
            A[end--] = B[indexB--];
        }
    }
}