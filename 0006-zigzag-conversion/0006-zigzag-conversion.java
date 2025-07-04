class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder[] zigzag = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            zigzag[i] = new StringBuilder();
        }
        int row = 0;
        boolean down = false;
        for (char ch : s.toCharArray()) {
            zigzag[row].append(ch);
            if (row == 0 || row == numRows - 1) {
                down = !down;
            }

            row += down ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder part : zigzag) {
            result.append(part);
        }
        return result.toString();      
    }
}