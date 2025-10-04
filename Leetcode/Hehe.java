import java.util.ArrayList;
import java.util.List;

public class Hehe {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        // s

        char[] chars = s.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : chars)
            charList.add(c);

        charList.remove(Character.valueOf('#'));

        char[] result = new char[charList.size()];
        for (int i = 0; i < charList.size(); i++)
            result[i] = charList.get(i);
        System.out.println(result);

        //t
        char[] chas = s.toCharArray();
        List<Character> arr = new ArrayList<>();
        for (char c : chas)
            arr.add(c);

        charList.remove(Character.valueOf('#'));

        char[] res = new char[charList.size()];
        for (int i = 0; i < charList.size(); i++)
            res[i] = charList.get(i);
        System.out.println(res);
        // End
        if (s == t) {
            System.out.print(true);
        } else {
            System.out.println(false);
        }

    }
}
