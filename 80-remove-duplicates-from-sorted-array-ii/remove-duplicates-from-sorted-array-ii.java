class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n=nums.length;
        if(n<=2) return n;// if array has 2 or fewer elements nothing to remove 
        int pos =2; //position where we can place next allowed number 
        for (int i=2; i< n; i++){
            //only add nums[i] if its not the same as the number two positions back
            if(nums[i] !=nums[pos - 2]){
                nums[pos] =nums[i];
                pos++;
            }
        }
        return pos;
    }
}