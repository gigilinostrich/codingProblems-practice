import java.util.*;
class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
public class LinkedListDay15 {
	 public static  Node insert(Node head,int data) {
	        //Complete this method
		 // insert list recursively
	      if(head == null) // if head is empty, create the first node
	          return new Node(data);
	      else if(head.next == null){ // if the head's next node is empty, add a node next to head
	              head.next = new Node(data);
	          }
	      else{
	          insert(head.next,data); // if there are two nodes, keep adding nodes
	      }
	          return head; // return node type, (head), from the parameter list
	    }

		public static void display(Node head) {
	        Node start = head;
	        while(start != null) {
	            System.out.print(start.data + " ");
	            start = start.next;
	        }
	    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

	}


