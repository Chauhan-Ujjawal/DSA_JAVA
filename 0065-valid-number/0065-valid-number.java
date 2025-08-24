class Solution {
    public boolean isNumber(String s) {
        s = s.trim(); // remove spaces
        // Allow both e and E for exponent
        String regex = "^[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))([eE][+-]?\\d+)?$";
        return s.matches(regex);
    }
}
