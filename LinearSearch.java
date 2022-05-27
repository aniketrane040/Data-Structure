import java.util.Scanner;

class LinearSearch
{
	// linear search function
	public static int linearSearch(int arr[],int searchData)
	{
		int location = -1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == searchData)
			{
				location = i;
				break;
			}
		}
		return location;
	}

	// main function
	public static void main(String[] args) 
	{
		System.out.println("\n---------------Linear Search----------------");
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
		
		// call linearSearch function
		int location = linearSearch(arr,searchData);

		if(location == -1)
			System.out.println(searchData+" is not present in given array");
		else
			System.out.println(searchData+" is present in given array at location "+location);
	}
}