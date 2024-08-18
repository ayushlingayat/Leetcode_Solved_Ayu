class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) 
    {
        int n = profits.length;
        int[][] projects = new int[n][2];

        int profit =0;
        for(int i=0; i<n; i++) {
            projects[i][0] = profits[i];
            projects[i][1] = capital[i];
        }
        Arrays.sort(projects, (a,b) -> a[1] -b[1]);
        int i=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(k>0) {
            while(i<capital.length && projects[i][1] <= w ) {

                pq.add(projects[i][0]);
                i++;
            }
            if(pq.isEmpty()) {
                break; 
            }
            int front = pq.poll();
            w = w + front;


            k--;
        }
        return w;
    }
}