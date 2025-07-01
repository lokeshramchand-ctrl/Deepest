public class sortArray {
    public int[] sortArray(int[] nums)
    {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    private void mergeSort(int[] array , int low , int high)
    {
        if(low >= high)
        {
            return;
        }
        int mid = (high+low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array,low,mid,high);
    }
    private void merge(int[] arr , int low ,int mid, int high)
    {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] leftpart = new int[n1];
        int[] rightpart = new int[n2];


        for(int i = 0 ; i < n1 ; i++)
        {
            leftpart[i] = arr[low + i];
        }
        for(int j = 0 ; j < n2 ; j++)
        {
            rightpart[j] = arr[mid+1+j];
        }

        int i = 0 , j = 0;
        int k = low;

        while(i < n1 && j < n2)
        {
            if(leftpart[i] <= rightpart[j])
            {
                arr[k] = leftpart[i];
                i++;
            }
            else
            {
                arr[k] = rightpart[j];
                j++;
            }
            k++;
        }

            while(i < n1)
            {
                arr[k] = leftpart[i];
                i++;
                k++;
            }
            while(j < n2)
            {
                arr[k] = rightpart[j];
                j++;
                k++;
            }
        

    }
}
