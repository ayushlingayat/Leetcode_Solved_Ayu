class Solution {
    private void solveRecBacktracking(int idx, int[] candidates, int target, List<List<Integer>> res, List<Integer> l) {
        if (target < 0)
            return;
        if (target == 0) {
            res.add(new ArrayList<>(l));
            return;
        }

        // Backtracking.....
        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }

            l.add(candidates[i]);
            solveRecBacktracking(i + 1, candidates, target - candidates[i], res, l);
            l.remove(l.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        solveRecBacktracking(0, candidates, target, res, new ArrayList<>());

        return res;
    }
}