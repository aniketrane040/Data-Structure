import java.util.Scanner;

class InsertionSort
{
	public static void insertionSort(int arr[],int n)
	{
		// Insertion sort logic
		for(int i=1; i<n; i++)
		{
			int unsorted_list_element = arr[i];

			// index is of sorted list
			int index = i - 1;

			// compare unsorted list element with sorted list
			while(index >= 0 && unsorted_list_element < arr[index])
			{
				arr[index+1] = arr[index];
				index-=1;
			}

			// put unsorted list element in sorted list
			arr[index+1] = unsorted_list_element;
		}	
	}

	// printing array elements function
	public static void printArray(int arr[])
	{
		System.out.println("The array is as follows: \n");

		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+"  ");

		System.out.println("\n_________________________________________");
	}

	// main function
	public static void main(String[] args) 
	{
		System.out.println("\n---------------Insertion Sort----------------\n");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of Elements: ");
		int n = scan.nextInt();

		int arr[] = new int[n];

		// read array input of size n
		System.out.println("\nEnter "+n+" elements: ");
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();

		// print array before sorting array elements
		System.out.println("Before Sorting\n");
		printArray(arr);

		// call insertionSort for sorting
		insertionSort(arr,n);

		// print array after applying insertion sort
		System.out.println("\nAfter Sorting using Insertion Sort\n");
		printArray(arr);
	}
}