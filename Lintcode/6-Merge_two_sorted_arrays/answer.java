public class Solution {
    /*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int Aindex = 0;
        int Bindex = 0;
        int Asize = A.length;
        int Bsize = B.length;
        int answerSize = Asize + Bsize;
        int[] answer = new int[answerSize];
        int index = 0;
        
        while(index != answerSize){
            if(Aindex == Asize){
                answer[index] = B[Bindex];
                Bindex++;
            }else if(Bindex == Bsize){
                answer[index] = A[Aindex];
                Aindex++;
            }else{
                if(A[Aindex] > B[Bindex]){
                    answer[index] = B[Bindex];
                    Bindex++;
                }else{
                    answer[index] = A[Aindex];
                    Aindex++;
                }
            }
            
            index++;
        }
        
        return answer;
    }
}