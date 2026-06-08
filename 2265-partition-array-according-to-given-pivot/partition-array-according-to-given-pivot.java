class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int pivotCnt = 0;
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                pivotCnt++;
            }else if(nums[i]<pivot){
                pre.add(nums[i]);
            }else if(nums[i]>pivot){
                post.add(nums[i]);
            }
        }
        int n = post.size();
        int j = 0;
        while(j<n || pivotCnt>0){
            if(pivotCnt>0){
                pre.add(pivot);
                pivotCnt--;
            }else{
                pre.add(post.get(j));
                j++;
            }
        }
        int[] ans = pre.stream()
                .mapToInt(Integer::intValue)
                .toArray();
       return ans;
    }
}