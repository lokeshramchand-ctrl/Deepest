class Solution {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String check = "ad";
        char[] charsToCheck = check.toCharArray();
        int count = 0;
        for (String word : strs) {
            boolean letter = false;
            for (char c : charsToCheck) {
                if (word.indexOf(c) != -1) {
                    letter = true;
                    break;
                }
            }
            if (!letter) {
                count++;
            }
        }
        System.out.println(count);
    }

}
