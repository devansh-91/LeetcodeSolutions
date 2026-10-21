class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        for(int i=0;i<l;i=i+2)
            if(i==l-1 || nums[i]!=nums[i+1])
                return nums[i];
        return 0;
    }
}