import java.util.*;

class Node{
    Node left,right; // right node, left node instance variables
    int data; // data instance variable 
    Node(int data){ // node constructor
        this.data=data; // set data to variable
        left=right=null; // initialize right and left nodes null
    }
}
public class binarySearchTreeDay22 {
	public static int getHeight(Node root){
	      
	     int heightLeft = 0; // set the height of subtrees to 0 
	    int heightRight = 0;

	    if (root.left != null) { // if there is a left subtree
	        heightLeft = getHeight(root.left) + 1; // traverse left subtree
	    }
	    if (root.right != null) { // if there is a right subtree
	        heightRight = getHeight(root.right) + 1; // traverse right subtree
	    }
// if left height is greater than right height, return height left, else return right height
	  return (heightLeft > heightRight ? heightLeft : heightRight);
	    }
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
	public static void main(String[] args) {
//Complete the getHeight function provided in your editor so that 
//it returns the height of the binary search tree. T
	    Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null; // set Node object root as null
        while(T-->0){ // input nodes
            int data=sc.nextInt();
            root=insert(root,data); // call insert method to form a BST
        }
        int height=getHeight(root); // after done inserting, call height method
        System.out.println(height);
        sc.close();
    }

	}


