import java.util.Scanner;

class BubbleSort
{
	// swaping array elements function
	public static void swap(int arr[],int i, int j)
	{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp; 
	}

	public static void bubbleSort(int arr[],int n)
	{
		// Bubble sort logic
		for(int i=n-1; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap(arr,i,j);
				}
			}
		}	

		// alternate logic for bubble sort
		// for (int i = 0; i < n - 1; i++)
  		// 		for (int j = 0; j < n - i - 1; j++)
  		//      	if(arr[j] > arr[j+1])
		// 				swap(arr,i,j);
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
		System.out.println("---------------Bubble Sort----------------");

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

		// call bubbleSort for sorting
		bubbleSort(arr,n);

		// print array after applying bubble sort
		System.out.println("\nAfter Sorting using Bubble Sort\n");
		printArray(arr);
	}
}