import java.util.*;
 
public class tuf {
 
public static void main(String args[]){  
   
   int arr[] = {0,1,2,2,4,4,1};
     int n = arr.length;
     Frequency(arr, n);
  }
static void Frequency(int arr[], int n)
{
    Map<Integer, Integer> map = new HashMap<>();
 
    for (int i = 0; i < n; i++)
    {
        if (map.containsKey(arr[i]) && arr[i] % 2 == 0)
        {
            map.put(arr[i], map.get(arr[i]) + 1);
        }
        else if ( arr[i] % 2 == 0)
        {
            map.put(arr[i], 1);
        }
    }

// Step 1: Find the maximum value
int maxValue = Integer.MIN_VALUE;
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() > maxValue) {
        maxValue = entry.getValue();
    }
}
int count = 0;
// Step 2: Print keys with value equal to maxValue
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() == maxValue) {
      //  System.out.println(entry.getKey());
        count++;
    }
}
System.out.println(count);

}
}
