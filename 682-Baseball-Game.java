
class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals(\C\) && !operations[i].equals(\D\) && !operations[i].equals(\+\)) {
                int num = Integer.valueOf(operations[i]);
                sum += num;
                ans.add(num);
            } else if (operations[i].equals(\C\)) {
                if (!ans.isEmpty()) {
                    sum -= ans.get(ans.size() - 1);
                    ans.remove(ans.size() - 1);
                }
            } else if (operations[i].equals(\D\)) {
                if (!ans.isEmpty()) {
                    int doubled = 2 * ans.get(ans.size() - 1);
                    sum += doubled;
                    ans.add(doubled);
                }
            } else if (operations[i].equals(\+\)) {
                int size = ans.size();
                if (size >= 2) {
                    int sumOfLastTwo = ans.get(size - 1) + ans.get(size - 2);
                    sum += sumOfLastTwo;
                    ans.add(sumOfLastTwo);
                }
            }
        }
        return sum;
    }
}
