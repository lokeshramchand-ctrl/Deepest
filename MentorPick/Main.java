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

        for (String word : words) {
            for (char c : charsToCheck) {
                if (word.indexOf(c) != -1) {
                    System.out.println(word + " contains the letter " + c);
                }
            }
        }
    }

}
