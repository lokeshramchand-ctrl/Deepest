import java.util.Scanner;
/* 
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
      for(int i = nums.length - 1 ; i >= 0 && nums[i] > target ; i--)
      {
            nums[i+1] = nums[i];
            nums[i+1] = target;
      }
      return nums.length+1;
    }
      public static void main(String[] args) {
            int n;
            int target;
            int found = 0;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
                  target = sc.nextInt();

                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  for(int i = 0 ; i < n ; i++)
                  {
                        if(arr[i] == target)
                        {
                              System.out.println("Found" + i);
                              found = 1;
                              break;
                        }
                        else
                        {
                              searchInsert(arr[i] , target);
                        }
                  }

            }


      }
}
*/

class SearchInsert
{
    public int searchInsert(int[] nums, int target) 
      {
            
            return nums.length+1;
      }
}