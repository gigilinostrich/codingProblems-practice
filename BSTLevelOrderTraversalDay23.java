import java.util.*;
class Node{
    Node left,right; // right node, left node instance variables
    int data; // data instance variable 
    Node(int data){ // node constructor
        this.data=data; // set data to variable
        left=right=null; // initialize right and left nodes null
    }
}

public class BSTLevelOrderTraversalDay23 {
	public static Node insert(Node root,int data){
        if(root==null){ // if there is no root node, create one with data
            return new Node(data);
        }
        else{ // if the root node already exists
            Node cur; // current root node
            if(data<=root.data){ // if data is less than the root
                cur=insert(root.left,data); // insert into the left subtree
                root.left=cur; // left subtree becomes current node
            }
            else{ // if data is greater than the root
                cur=insert(root.right,data); // insert node to the right subtree
                root.right=cur; // right subtree becomes current node 
            }
            return root; // if no requirement meet, just return the root, just a node
        }
    }
	//A level-order traversal, also known as a breadth-first search, visits each level of
	//a tree's nodes from left to right, top to bottom. You are given a pointer, root,
	//pointing to the root of a binary search tree. Complete the levelOrder function provided 
	//in your editor so that it prints the level-order traversal of the binary search tree.
	static void levelOrder(Node root){
	    //A level-order traversal of tree t is a recursive algorithm that processes the root, 
		//followed by the children of the root (from left to right), followed by the grandchildren
		//of the root (from left to right), etc. The basic algorithm shown below uses a queue of references
		//to binary trees to keep track of the subtrees at each level:  
		
		
		//Write your code here
		Queue <Node> q = new LinkedList<Node>();

			// enqueue current root
			q.add(root);
	
		// while there are nodes to process
		while(!q.isEmpty()) {
			// dequeue next node
			Node current = q.remove();
			// process tree's root, print 
			System.out.print(current.data + " "); // shows what it removed
			// enqueue child elements from next level in order
			// if tree has non empty left subtree
			if (current.left != null) {
				q.add(current.left);
			}
			// if tree has non empty right subtree
			if (current.right != null) {
				q.add(current.right);
			}
			
		}
	      
	    }
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
          int T=sc.nextInt();
          Node root=null;
          while(T-->0){
              int data=sc.nextInt();
              root=insert(root,data);
          }
          levelOrder(root);
          sc.close();
      }	

	}


