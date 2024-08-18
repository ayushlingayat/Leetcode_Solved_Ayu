class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) 
    {
        Map<Integer, List<Integer>> from = new HashMap<>();

        Map<Integer, List<Integer>> to = new HashMap<>();

        Map<Integer, Integer> degree = new HashMap<>();

        for(int edge[]: edges)
        {
            to.putIfAbsent(edge[1], new ArrayList<>());
            to.get(edge[1]).add(edge[0]);
            from.putIfAbsent(edge[0], new ArrayList<>());
            from.get(edge[0]).add(edge[1]);
            degree.put(edge[1], degree.getOrDefault(edge[1], 0)+1);
        }

        Map<Integer, Set<Integer>> ancestors= new HashMap<>();
        
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            if(degree.getOrDefault(i,0)==0)
            {
                q.add(i);
            }
        }

        while(!q.isEmpty())
        {
            int u=q.poll();
            Set<Integer> res= new HashSet<>();

            for(int ancestor: to.getOrDefault(u, new ArrayList<>()))
            {
                res.add(ancestor);
                res.addAll(ancestors.getOrDefault(ancestor, new HashSet<>()));
            }

            ancestors.put(u, res);

            for(int v: from.getOrDefault(u, new ArrayList<>()))
            {
                degree.put(v, degree.get(v)-1);

                if(degree.get(v)==0)
                {
                    q.add(v);
                }
            }
        }

        List<List<Integer>> sortedResults = new ArrayList<>(n);

        for(int i=0;i<n;i++)
        {
            Set<Integer> result = ancestors.get(i);

            List<Integer> sorted = new ArrayList<>(result);

            Collections.sort(sorted);

            sortedResults.add(sorted);
        }

        return sortedResults;       
    }
}