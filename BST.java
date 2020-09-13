// Create Binary Search Tree(BST) inorder


import java.util.*;

public class BST
{
	public static void main(String args[])
	{
         Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Total Tree Node includeing Root");
		 int n=sc.nextInt();
		 System.out.println("Enter the element: ");
		 
		BST tree=new BST();
		
		while(n>0)
		{
		int t=sc.nextInt();
		tree.insert(t);
		
		n--;
		}
		tree.inorder();
		tree.postorder();
		tree.preorder();
		
		
	}
	class Node{
		int val;
		Node left,right;
		
		public Node(int item)
		{
			val=item;
			left=right=null;
		}
	}
	
	Node root;
	
	BST(){
		root = null;
	}
	
	void insert(int val){
		
		root=insertRec(root,val);
	}
	
	Node insertRec(Node root,int val)
	{
		if(root==null)
		{
			root=new Node(val);
			return root;
		}
		if(val < root.val)
			root.left=insertRec(root.left, val);
		else if(val > root.val)
			root.right=insertRec(root.right, val);
		
		return root;
	}
	// INoRDER
	void inorder()
	{
		System.out.println("PostOrder Binary: ");
		inorderRec(root);
		
	}
	
	void inorderRec(Node root)
	{
		
		if(root!=null)
		{
			inorderRec(root.left);
			
			System.out.print(" "+root.val+" ");
			inorderRec(root.right);
		}
	}
	//pOST oRDER
	
	void postorder()
	{
		System.out.println();
		System.out.println("PostOrder Binary: ");
		postorderRec(root);
	}
	
	void postorderRec(Node root)
	{
		if(root!=null)
		{
			
			postorderRec(root.left);
			
			postorderRec(root.right);
			
			System.out.print(" "+root.val+" ");
		}
	}
	
	// Preorder
		void preorder()
	{
		System.out.println();
		System.out.println("PreOrder Of BST: ");
		preorderRec(root);
	}
	
	void preorderRec(Node root)
	{
		if(root!=null)
		{
			System.out.print(" "+root.val+" ");
			preorderRec(root.left);
			
			preorderRec(root.right);
			
		}
	}
	
	

}
	

