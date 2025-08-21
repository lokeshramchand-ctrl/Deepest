import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;
public class A_Submission_is_All_You_Need {

public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashSet<Integer> s = new HashSet<>();
            long sum = 0;
            boolean hasZero = false;
            while (st.hasMoreTokens()) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 0) hasZero = true;
                else sum += x;
                s.add(x);
            }
            int mex = 0;
            while (s.contains(mex)) mex++;
            if (hasZero) sb.append(sum + mex).append("\n");
            else sb.append(sum + mex - 1).append("\n");
        }
        System.out.print(sb.toString());
    }
}


