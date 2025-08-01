// Problem: https://leetcode.com/problems/contains-duplicate-ii
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // TC - O(n)
        // SC - O(n)
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
                return true;
            }
            map.put(nums[i],i);
        }

        return false;
    }
}