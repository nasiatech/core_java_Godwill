package task1;

public class ArrayCompare {
    static void compareElement(int arr[], int n){
        for (int i = 1; i < n - 1; i++)
        {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                System.out.print(arr[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 1, 5, 4, 9, 8, 7, 5 };
        int n = arr.length;

        compareElement(arr, n);
    }
}


