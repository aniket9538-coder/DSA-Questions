class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlength=0;
        int l=0;
        int r=0;
        int zeros=0;

        while(r<nums.length){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
               int length=r-l+1;
                maxlength=Math.max(maxlength,length);
                   r++;
            }
            
        }
        return maxlength;
    }
}