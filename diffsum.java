class Solution {
    public int differenceOfSum(int[] nums) {
       int sum1=0;
       for(int i=0;i<nums.length;i++){
        sum1+=nums[i];
       }
       int sum2=0;
       for(int i:nums){
           while(i>0){
              sum2+=(i%10);
              i/=10;
           }
       }
       return Math.abs(sum1-sum2);   
    }
}