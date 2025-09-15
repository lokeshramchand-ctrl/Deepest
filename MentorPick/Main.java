class Solution {
    public static void main(String[] args) {
        String text = "Hello World";
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
        String check = "ad";
        char[] charsToCheck = check.toCharArray();
        int count = 0;
        for (String word : words) {
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
