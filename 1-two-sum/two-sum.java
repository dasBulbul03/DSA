class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length; //nums is the given array here in the questain 
        int[] ans=new int[2];//this array we will return as answer 
        for(int i=0;i<n;i++ ){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){// it will find the number target
                ans[0]=i;
                ans[1]=j;
                break;

                }
            }
        }
        return ans;


    }
}