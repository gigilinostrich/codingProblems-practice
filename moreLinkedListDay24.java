import java.util.*;

class Node {
	int data; // node's data
	Node next;// node's next pointer

	Node(int d) { // parameterized constructor
		data = d; // set new data
		next = null; // initialize the next pointer as null
	}
}

public class moreLinkedListDay24 {
	public static Node removeDuplicates(Node head) {
		// Write your code here
		if (head == null) // if there is no head node, do nothing, return null
			return null;
		Node s = head; // create a node object s, initialize as head
		while (s.next != null) { // while s's next node is pointing to something
			if (s.data == s.next.data) // if there is a duplicate list
				s.next = s.next.next; // change the next pointer to point to the node that is two nodes away
			// meaning to skip over the middle node
			else
				s = s.next; // if there is no adjacent nodes that matches, keep on searching
		}
		return head; // return a node from the parameter
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data); // create a new node object p, with data
		if (head == null) // if there is no head node, meaning none at all
			head = p; // create the first node, which is the head
		else if (head.next == null) // if there is no second node
			head.next = p; // create the second node
		else { // if two nodes already exist, keep on adding 
			Node start = head; // create Node object start, initialize as head
			while (start.next != null) // while there are still some nodes around
				start = start.next; // let previous node points to the next node
			start.next = p; // create the next node as it proceeds

		}
		return head; // return the node that is created
	}

	public static void display(Node head) {
		Node start = head; // initialize the node object start as head
		while (start != null) { // as long as there is a head
			System.out.print(start.data + " "); // print data
			start = start.next; // go to the next node
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		sc.close();
		head = removeDuplicates(head);
		display(head);

	}

}
