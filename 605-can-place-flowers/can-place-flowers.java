class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean ans = true;
        int size = flowerbed.length;
        if(size==1 && flowerbed[0]==0) return true;
        for (int i = 0; i < size; i++) {
            if (i == 0 && size > 1 && flowerbed[1] == 0 && flowerbed[0] == 0) {
                flowerbed[0] = 1;
                n--;
            } else if (i == size - 1 && size > 1 && flowerbed[size - 1] == 0 && flowerbed[size - 2] == 0) {
                flowerbed[size - 1] = 1;
                n--;
            } else if (i > 0 && i < size - 1 && flowerbed[i]==0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        if(n>0) ans = false;
        return ans;
    }
}