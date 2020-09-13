// ZigZag Spiral tree Traversal

import java.util.*;

public class ZigZag1
{
  private class TreeNode
  {
	  TreeNode left;
	  TreeNode right;
	  int value;
	  public TreeNode(int value)
	  {
		  this.value=value;
	  }
  }
  
  TreeNode root;
  public void createTree()
  {
	  this.root=new TreeNode(0);
	  
	  TreeNode n1=new TreeNode(1);
	  TreeNode n2=new TreeNode(2);
	  TreeNode n3=new TreeNode(3);
	  TreeNode n4=new TreeNode(4);
	  TreeNode n5=new TreeNode(5);
	  TreeNode n6=new TreeNode(6);
	 // TreeNode n7=new TreeNode(7);
	 // TreeNode n8=new TreeNode(8);
	  //TreeNode n9=new TreeNode(9);
	  
	  root.left=n1;
	  root.right=n2;
	  
	    n2.right=n3;
	  n2.left=n4;
	  
	   n1.right=n5;
	  n1.left=n6;
	 
	  //n5.left=n7;
	  //n5.right=n8;
	  
	  //n6.left=n9;
	
  }
  
  private void spiralTraversal(TreeNode root)
  {
	 if(root==null)
	    return;
      Stack<TreeNode> s1=new Stack();
      Stack<TreeNode> s2=new Stack();

      s1.push(root);
      boolean evenlevel=true;
     while((evenlevel && !s1.isEmpty())||(!s2.isEmpty())) 
	 {
		 //if(evenlevel)
		 //{
			 while(!s1.isEmpty())
			 {
				 TreeNode N=s1.pop();
				  System.out.println(" "+N.value+" ");
				  if(N.left!=null)
					  s2.push(N.left);
				  if(N.right!=null)
					  s2.push(N.right);
			 }
		 //}
		 //else
		 //{
			 while(!s2.isEmpty())
			 {
				 TreeNode N=s2.pop();
				 System.out.println(" "+N.value+" ");
				 if(N.right!=null)
					 s1.push(N.right);
				 if(N.left!=null)
					 s1.push(N.left);
				 
			 }
		 //}
		 
		 //evenlevel=!evenlevel;
		 System.out.println();
     } 
  }
   public void spiralTraversal()
	 {
		 spiralTraversal(this.root);
	 }
	 public static void main(String args[])
	 {
		 ZigZag1 s=new ZigZag1();
		 s.createTree();
		 s.spiralTraversal();
	 }
  
  
  
  
}