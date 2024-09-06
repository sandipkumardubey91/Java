package LinkedList;

class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		next = null;
	}
	
}


public class LL {
	Node head;
	
	public void insertAtBegg(int data)
	{
		Node newNode = new Node(data);
		newNode.next = null;
		if(head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAfter(Node prev_node, int data)
	{
		if(prev_node == null)
		{
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = prev_node.next;
		prev_node.next = newNode;
	}
	
	public void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(head == null)
		{
			head = newNode;
			return;
		}
	
		
		Node temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
			
		}
		temp.next = newNode;
		return;
		
	}
	
	public void delete(int position)
	{
		if(head == null)
		{
			return;
		}
		
		Node temp = head;
		
		if(position == 0)
		{
			head = temp.next;
		}
		
		for(int i = 0; temp != null && i < position - 1; i++)
		{
			temp  = temp.next;
		}
		
		if(temp == null && temp.next == null )
		{
			return;
		}
		
		temp.next = temp.next.next;
	}
	
	public void reverse()
	{
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return;
	}
	
	public void reverseRec(Node curr, Node prev)
	{
		if(curr.next == null)
		{
			head = curr;
			curr.next = prev;
			return;
		}
		Node next = curr.next;
		curr.next = prev;
		reverseRec(next, curr);
	}
	
	public void findMiddle()
	{
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("The Middle Element is: " + slow.data);
	}
	
	
	public void loopDetection()
	{
		Node slow = head;
		Node fast = head;
		int flag = 0;
		
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)
			System.out.println("Loop is not detected.");
		else
			System.out.println("Loop is detected.");
	}
	
	public void printNodes()
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LL llist = new LL();
		
		llist.insertAtEnd(10);
		llist.insertAtEnd(20);
		llist.insertAtEnd(30);
		llist.insertAtEnd(40);
		
		llist.printNodes();
		
		System.out.println();
		System.out.println();
		
		
		llist.insertAtEnd(100);
		
		llist.printNodes();
		System.out.println();
		System.out.println();
		
		llist.insertAtBegg(5);
		llist.printNodes();
		System.out.println();
		System.out.println();
		
		llist.insertAfter(llist.head.next.next, 25);
		llist.printNodes();
		System.out.println();
		System.out.println();
		
		llist.delete(0);
		llist.printNodes();
		System.out.println();
		System.out.println();
		
		llist.reverse();
		llist.printNodes();
		System.out.println();
		System.out.println();
		
		llist.reverseRec(llist.head,null);
		llist.printNodes();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		llist.findMiddle();
		System.out.println();
		System.out.println();
		
		
		// Making linked list circular.
		
		Node temp = llist.head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = llist.head;
		
		
		llist.loopDetection();
		System.out.println();
		System.out.println();
		

	}

}

