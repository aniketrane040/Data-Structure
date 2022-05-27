import java.util.Scanner;

class SelectionSort
{
	// swaping array elements function
	public static void swap(int arr[],int i, int j)
	{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp; 
	}

	public static void selectionSort(int arr[],int n)
	{
		// Selection sort logic
		for(int i=0; i<n; i++)
		{
			int min_element_index = i;

			for(int j=i+1; j<n; j++)
			{
				if(arr[j] < arr[min_element_index])
					min_element_index = j;
			}
			swap(arr,i,min_element_index);
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
		System.out.println("\n---------------Selection Sort----------------");
		
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

		// call selectionSort for sorting
		selectionSort(arr,n);

		// print array after applying selection sort
		System.out.println("\nAfter Sorting using Selection Sort\n");
		printArray(arr);
	}
}
