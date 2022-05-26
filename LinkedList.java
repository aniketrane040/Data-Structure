import java.util.Scanner;

class LinkedList
{
	Node head;

	static class Node
	{
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	// insert node function

	public static LinkedList insertNode(LinkedList list, int data)
	{
		Node newNode = new Node(data);
		newNode.next = null;

		// if list is empty then insert node at the start(head)
		if(list.head == null)
		{
			list.head = newNode;
		}
		else
		{
			Node last = list.head;
			while(last.next != null)
			{
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	// delete node function

	public static LinkedList deleteNode(LinkedList list, int key)
	{
		Node currNode = list.head;
		Node prevNode = null;

		// check underflow condition
		if(currNode == null)
			System.out.println("\nUnderFlow Condition\n\nThere is No Element Present in the Linked List");

		// case 1:
		// check if data is present at first node
		if(currNode != null && currNode.data == key)
		{
			list.head = currNode.next;
			System.out.println(key + " is deleted from the Linked List");
			return list;
		}
		
			// case 2:
			// check key in upcoming nodes

			// check forwarded noded until next is null and key is not found
			while(currNode != null && currNode.data != key)
			{
				prevNode = currNode;
				currNode = currNode.next;
			}

			// if current node is not null means, key is found at current node
			if(currNode != null)
			{
				prevNode.next = currNode.next;
				System.out.println(key + " is deleted from the Linked List");
			}

			// case 3:
			// key is not present

			// if current node is null means we reach at the end of list and still not found 
			if(currNode == null)
			{
				System.out.println(key + " is not found in the Linked List");
			}
			return list;
	}

	// Searching a node in Linked List

	public static LinkedList searchKey(LinkedList list, int key)
	{
		int counter=0;
		Node currNode = list.head;

		while(currNode != null)
		{
			if(key == currNode.data)
			{
				System.out.println("The Key is Found in the Linked List at Location "+counter);
				return list;
			}
			counter+=1;
		}
		System.out.println("The key is not Present in the given Linked List");
		return list;
	}

	// print linked list function
	
	public static void printLinkedList(LinkedList list)
	{
		Node currNode = list.head;
		System.out.println("The Linked List as follows: \n");

		if(currNode == null)
			System.out.println("There is No Element Present in the Linked List");
		
		while(currNode != null)
		{
			System.out.print(currNode.data+" --> ");	
			currNode = currNode.next;
		}
		System.out.println();
	}


	// Driver code
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		LinkedList list = new LinkedList();

		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. Search");
		System.out.println("4. Display");
		System.out.println("5. Exit");

		int choice=0;
		do
		{
			System.out.println("________________________________________________________________");
			System.out.println("\nEnter your choice: ");
			choice = scan.nextInt();

			switch(choice)
			{
				case 1: System.out.println("Enter data: ");
						int data = scan.nextInt();
						list = insertNode(list,data);
						System.out.println(data+" is inserted in Linked List");
						break;

				case 2: System.out.println("Enter a key: ");
						int key = scan.nextInt();
						list = deleteNode(list,key);
						break;

				case 3: System.out.println("Enter a Key to Search: ");
						int searchingkey = scan.nextInt();
						list = searchKey(list,searchingkey);
						break;

				case 4: printLinkedList(list);
						break;

				case 5: System.out.println("Bye...");
						break;

				default: System.out.println("Invalid Choice");
			
			}
		}while(choice != 5);
	}
}