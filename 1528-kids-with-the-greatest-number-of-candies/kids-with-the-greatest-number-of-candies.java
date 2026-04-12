class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = Integer.MIN_VALUE;
        int n = candies.length;
        for(int i=0;i<n;i++){
            maxi = Math.max(candies[i], maxi);
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<n;i++){
           boolean temp = candies[i]+extraCandies>=maxi ? true : false;
           list.add(temp);
        }
        return list;
    }
}