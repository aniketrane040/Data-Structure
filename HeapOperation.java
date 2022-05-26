import java.util.Scanner;

public class HeapOperation
{
	// swap the elements in array
	public static void swap(int arr[],int i,int j)
	{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// heapify method
	public static void heapify(int arr[],int i,int n)
	{
		int largest = i;
		int left_node = (largest * 2) + 1;
		int right_node = (largest * 2) + 2;

		// if left_node is greater than largest node
		if(left_node < n && arr[largest] < arr[left_node])
			largest = left_node;

		// if right_node is greater than largest node
		if(right_node < n && arr[largest] < arr[right_node])
			largest = right_node;

		// if largest is not i then swap the elements and apply heapify to largest element
		if(largest != i)
		{
			swap(arr,i,largest);
			heapify(arr,largest,n);
		}		
	}

	// constructHeap Method
	public static void constructHeap(int arr[],int n)
	{
		// starting from last non-leaf node index
		int startIndex = (n / 2) - 1;

		// apply heapify to each node from startIndex in reverse order
		for(int i=startIndex; i >= 0; i--)
		{
			heapify(arr,i,n);
		}
	}

	// printHeap Method
	public static void printHeap(int arr[], int n)
	{
		System.out.println("\n\nMax Heap : \n");
		for(int i=0; i < n; i++)
			System.out.print(arr[i]+"   ");
	}

	// delete element in Heap
	public static int deleteElement(int arr[],int n)
	{
		int maxElement = arr[0];
		System.out.println("the deleted element is " + maxElement);
		arr[0] = arr[n-1];
		n = n-1;
		
		// heapify the root
		heapify(arr,0,n);

		return n;
	}

	// Driver Code
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n = scan.nextInt();

		int[] arr = new int[n];

		System.out.println("\nEnter "+n+" elements : ");

		for(int i=0; i < n; i++)
		{
			arr[i] = scan.nextInt();
		}
		constructHeap(arr,n);
		printHeap(arr,n);

		int choice;
		System.out.print("\n1. Delete \n2. Display \n3. Exit");
		do
		{
			System.out.print("\n\nEnter your choice: ");
			choice = scan.nextInt();

			switch(choice)
			{
				case 1: n = deleteElement(arr,n);
						break;
				case 2: printHeap(arr,n);
						break;
				case 3: System.out.println("Bye !");
						break;
				default: System.out.println("Invalid Input");
			}
		}while(choice != 3);
	}
}