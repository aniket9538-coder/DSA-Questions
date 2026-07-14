class Solution {
    public int maxProduct(int[] nums) {

        int leftproduct=1;
        int rightproduct=1;

        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
          
          if(leftproduct==0){
            leftproduct=1;
          }
         if(rightproduct==0){
            rightproduct=1;
          }


            leftproduct=leftproduct*nums[i];

            rightproduct=rightproduct*nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(leftproduct,rightproduct));
        }
        return ans;
    }
}