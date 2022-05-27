import java.util.Scanner;

class BinarySearch
{
	// binary search function
	public static int binarySearch(int arr[],int searchData)
	{
		int location = -1;
		int lower_bound = 0;
		int upper_bound = arr.length;
		int mid;

		// when lower_bound will be greater than upper_bound means element not present in the array
		while(lower_bound < upper_bound)
		{
			mid = (lower_bound+upper_bound) / 2;

			if(arr[mid] == searchData)
			{
				location = mid;
				break;
			}

			// if mid elemnt is greater than searchData that means element may present in first portion else it may in second portion.
			if(arr[mid] > searchData)
			{
				upper_bound = mid - 1;
			}
			else
			{
				lower_bound = mid + 1;
			}
		}
		return location;
	}

	// main function
	public static void main(String[] args) 
	{
		System.out.println("\n---------------Binary Search----------------");
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter no. of Elements: ");
		int n = scan.nextInt();

		int arr[] = new int[n];

		// read array input of size n
		System.out.println("\nEnter "+n+" elements: ");
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();

		// read searching data in array
		System.out.print("\nEnter element to Search: ");
		int searchData = scan.nextInt();
		
		// call binarySearch function
		int location = binarySearch(arr,searchData);

		if(location == -1)
			System.out.println(searchData+" is not present in given array");
		else
			System.out.println(searchData+" is present in given array at location "+location);
	}
}