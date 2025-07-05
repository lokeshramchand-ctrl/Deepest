//Print numbers from 1 to N

import java.util.Scanner;

public class PrintNum
{
      public static void main(String[] args)
      {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
            }
            for(int i = 0 ; i <= n ; i++)
            {
                  System.out.println(i+i);
                  
            }             
      }
}