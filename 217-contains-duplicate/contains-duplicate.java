class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(count.containsKey(nums[i]))
                return true;
            count.put(nums[i],0);
        }
        return false;
    }
}