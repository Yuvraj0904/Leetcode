class Solution { 
    public int missingMultiple(int[] nums, int k) { 
        int n = nums.length; 
        
        HashSet<Integer> elem = new HashSet<>(); 
        
        for (int i = 0; i < n; i++) { 
            elem.add(nums[i]); 
        } 
        
        int toFind = 0;
        
        for (int i = 1; i <= 101; i++) { 
            toFind = k * i; 
            
            if (elem.contains(toFind)) { 
                continue; 
            } 
            else { 
                break; 
            } 
        } 
        
        return toFind; 
    } 
}