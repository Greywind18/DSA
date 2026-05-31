class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        // int i=0, j = n-1;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - nums[i])) {
                ans++;
                int tempcnt = map.get(k - nums[i]);
                if (tempcnt > 0) {
                    tempcnt--;
                    if (tempcnt == 0) {
                        map.remove(k - nums[i]);
                    } else {
                        map.put(k-nums[i], tempcnt);
                    }
                }
            } else {
               map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return ans;
        // while(i<j){
        //     if(nums[i]+nums[j]==k){
        //         ans++;
        //         i++;
        //         j--;
        //     }else if(nums[i]+nums[j]<k){
        //         i++;
        //     }else{
        //         j--;
        //     }
        // }
        // return ans;
    }
}