class Solution:
    """
    @param: : the 1st string
    @param: : the 2nd string
    @return: uncommon characters of given strings
    """

    def concatenetedString(self, s1, s2):
        # write your code here
        
        map = dict()
        result = ""
        
        for i in range(len(s1)):
            map[s1[i]] = 1
        
        for i in range(len(s2)):
            current = s2[i]
            if(current in map):
                map[current] = 0
                
        for i in range(len(s1)):
            current = s1[i]
            if(map[current] == 1):
                result += current
                
        for i in range(len(s2)):
            current = s2[i]
            if(current not in map):
                result += current
        
        
        return result