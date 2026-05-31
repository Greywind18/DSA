class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        boolean ans = true;
        long planetMass = mass;
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]<=planetMass){
                planetMass+=asteroids[i];
            }else{
                return false;
            }
        }
        return ans;
    }
}