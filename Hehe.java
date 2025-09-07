public class Hehe{
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < t.length(); i++) {
            System.out.print(t.charAt(i) + " ");
        }
        if(s.contains(t))
        {
            System.out.print(t);
        }
        
    }
}
