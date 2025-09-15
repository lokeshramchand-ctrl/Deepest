class Solution {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
StringBuilder commonPrefix = new StringBuilder();
        for (String word : strs) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < strs[0].length(); i++) { 
            char c = strs[0].charAt(i);
            boolean allMatch = true;
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) {
            commonPrefix.append(c);
            }
        }
String s = commonPrefix.toString();
return s ;
    }
}
