package arraysorting;
public class ArraySorting 
{
    public static void main(String[] args) 
    {
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = (int)(Math.random()*6+1);
        display(a);
        selectionSort(a);
        display(a);
    }
    
    public static int binarySearch(int arr[], int key)
    {
        int min = 0;
        int mid = arr.length / 2;
        int max = arr.length;
        
        while (max > min)
        {
            if (key == arr[mid])
                return mid;
            else if (key > arr[mid])
            {
                min = mid +1;
                mid = max - min / 2;
            }
            else if (key < arr[mid])
            {
                max = mid - 1;
                mid = max - min / 2;
            }
        }
        return -1;
    }
    
    public static int sequentialSearch(int arr[], int key)
    {
        for (int i = 0; i < arr.length; i++)
            if(arr[i] == key)
                return i;
        return -1;
    }
    
    public static void insertionSort(int[] arr)
    {
        int temp;
        for (int i = 1; i < arr.length; i++)
        {
            while(i > 0 && arr[i] < arr[i-1])
            {
                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
            
        }
    }
    
    public static void selectionSort(int[] arr)
    {
        int smallest;
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            smallest = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[smallest])
                    smallest = j;
            }
            temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    
    public static void bubbleSort(int[] arr)
    {
        int temp = -1;
        for (int i = 10; i > 0; i--)
        {
            for (int j = 0; j < arr.length-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        
    }
    
    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
        System.out.println("\n");
    }
    
}
