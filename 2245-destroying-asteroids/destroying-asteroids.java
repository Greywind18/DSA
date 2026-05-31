class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int maxAsteroid = 0;
        int n = asteroids.length;
        for(int i=0;i<n;i++){
            if(asteroids[i]>maxAsteroid){
                maxAsteroid = asteroids[i]; 
            }
        }
        int []freq = new int[maxAsteroid+1];
        for(int i=0;i<n;i++){
            freq[asteroids[i]]++;
        }
        long currentMass = mass;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                if(i>currentMass) return false;
                currentMass+=(long)i*freq[i];
            }
        }
        return true;
        // Arrays.sort(asteroids);
        // boolean ans = true;
        // long planetMass = mass;
        // for(int i=0;i<asteroids.length;i++){
        //     if(asteroids[i]<=planetMass){
        //         planetMass+=asteroids[i];
        //     }else{
        //         return false;
        //     }
        // }
        // return ans;
    }
}