class Solution {
    public int maxDistance(int[] position, int m) 
    {
        int n = position.length;
        Arrays.sort(position);

        int low = 1, high = position[n - 1] - position[0];
        int ans = 0;

        while (low <= high) 
        {
            int mid = (low + high) / 2;
            if (canWePlace(position, mid, m)) {
                ans = mid; 
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;        
    }

    public boolean canWePlace(int[] pos, int d, int m) 
    {
        int n = pos.length; 
        int count = 1; 
        int lastPos = pos[0]; 

        for (int i = 1; i < n; i++) {
            if (pos[i] - lastPos >= d) {
                count++; 
                lastPos = pos[i]; 
            }
            if (count >= m) return true; 
        }
        return false;
    }
}