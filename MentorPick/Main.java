class Solution {
    public static void main(String[] args)
    {
        String text = "Hello World";
        String[] words = text.split("\\s+"); 
        for(int i = 0 ; i < words.length ; i++)
        {
            System.out.print(words[i] + " ");
        }
    }
}
