import java.util.*;
//Failed
public class BST1
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
		char t=sc.next().charAt(0);
		tree.insert(t);
		
		n--;
		}
		tree.inorder();
		
		
		
	}
	class Node{
		char val;
		Node left,right;
		
		public Node(char item)
		{
			val=item;
			left=right=null;
		}
	}
	
	Node root;
	
	BST1(){
		root = null;
	}
	
	void insert(char val){
		
		root=insertRec(root,val);
	}
	
	Node insertRec(Node root,char val)
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
		System.out.println("inOder Binary: ");
		inorderRec(root);
		
	}
	
	void inorderRec(Node root)
	{
		
		if(root!=null)
		{
			System.out.print(" "+root.val+" ");
			inorderRec(root.left);
			
			//System.out.print(" "+root.val+" ");
			inorderRec(root.right);
			//System.out.println(" "+root.val+" ");
		}
	}
}