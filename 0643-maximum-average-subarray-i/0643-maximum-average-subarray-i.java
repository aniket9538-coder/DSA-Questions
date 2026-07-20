class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int left=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int right=0;right<arr.length;right++){
            sum=sum+arr[right];

            if(right-left+1==k){
                maxSum=Math.max(maxSum,sum);

                sum=sum-arr[left];
                left++;
            }
        }
        return (double)maxSum/k;
    }
}