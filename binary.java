import java.util.Scanner;

class binary {
    public static void binarySearch(int A[], int beg, int end, int key) 
    {
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (A[mid] == key)
                {
                    System.out.println("Element found at index "+ mid +" and at location "+ (mid+1));
                    System.exit(0);
                }
            else if (A[mid] > key)
                end = mid - 1;
            else
                beg = mid + 1;
        }
    }
    public static void main(String args[]) {
        int[] a = new int[50];
        int n, k;
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the array size:");
        n = data.nextInt();
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            a[i] = data.nextInt();
        int temp;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n-1-i; j++) 
            {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++)
            System.out.print(a[i]+" ");
        System.out.println("\nEnter the search element:");
        k = data.nextInt();
        binarySearch(a, 0, n, k);
    }
}