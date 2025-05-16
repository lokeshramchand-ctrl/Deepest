import java.util.*;
public class LeapYear {
      public static void main(String[] args) {
                 int n;
                        try (Scanner sc = new Scanner(System.in)) {
                              n = sc.nextInt();
                        }
                        if(n % 400 == 0 && n % 4 == 0 & n % 100 == 0)
                        {
                              System.out.println("Leap year");
                        }
                        
            
      }
}
