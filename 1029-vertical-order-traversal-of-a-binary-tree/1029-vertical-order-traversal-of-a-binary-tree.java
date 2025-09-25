class Solution {
    // Custom class to store column, row, and node value
    static class Tuple {
        int col, row, val;
        Tuple(int col, int row, int val) {
            this.col = col;
            this.row = row;
            this.val = val;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<Tuple> list = new ArrayList<>();
        // DFS to collect (col, row, val)
        dfs(root, 0, 0, list);

        // Sort by col, then row, then value
        Collections.sort(list, (a, b) -> {
            if (a.col != b.col) return a.col - b.col;
            if (a.row != b.row) return a.row - b.row;
            return a.val - b.val;
        });

        // Group by col
        List<List<Integer>> result = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;
        List<Integer> currList = new ArrayList<>();
        for (Tuple t : list) {
            if (t.col != prevCol) {
                if (!currList.isEmpty()) result.add(currList);
                currList = new ArrayList<>();
                prevCol = t.col;
            }
            currList.add(t.val);
        }
        result.add(currList);

        return result;
    }

    // DFS helper
    private void dfs(TreeNode node, int col, int row, List<Tuple> list) {
        if (node == null) return;
        list.add(new Tuple(col, row, node.val));
        dfs(node.left, col - 1, row + 1, list);
        dfs(node.right, col + 1, row + 1, list);
    }
}
