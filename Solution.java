class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ret = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == 2){
                ret[0] = nums[i];
            }
        }

        for(int i = 1; i <= nums.length; i++){
            if(map.getOrDefault(i, 0) == 0){
                ret[1] = i;
            }
        }

        return(ret);
    }
}
