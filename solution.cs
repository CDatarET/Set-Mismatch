public class Solution {
    public int[] FindErrorNums(int[] nums) {
        int[] ret = new int[2];
        Dictionary<int, int> d = new Dictionary<int, int>();
        for(int i = 0; i < nums.Length; i++){
            if(d.ContainsKey(nums[i])){
                d[nums[i]]++;
                ret[0] = nums[i];
            }
            else{
                d[nums[i]] = 1;
            }
        }

        for(int i = 1; i <= nums.Length; i++){
            if(!(d.ContainsKey(i))){
                ret[1] = i;
            }
        }

        return(ret);
    }
}
