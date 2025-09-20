class Solution {
    public int majorityElement(int[] nums) {
        int a=nums.length;
        int b=a/2;
        for(int i=0;i<a;i++){
            int count=0;
            for(int j=0;j<a;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(b<count){
                 return nums[i];
            }
        }
        return -1;
    }
}