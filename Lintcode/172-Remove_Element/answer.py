class Solution:
    """
    @param: A: A list of integers
    @param: elem: An integer
    @return: The new length after remove
    """
    def removeElement(self, A, elem):
        # write your code here
        
        size = len(A)
        indexes = []
        
        for i in range(size):
            if A[i] == elem:
                indexes.append(i)
                
        for i in sorted(indexes, reverse = True):
            del A[i]
            
        return A
