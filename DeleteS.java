// Remove Element from the String

import java.util.*;

public class DeleteS
{
	public static void main(String args[])
	{
		String s;
		int p1;
		int temp=0;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String :  ");
		s=sc.nextLine();
		
		
		
		char a[]=s.toCharArray();
		int n=a.length;
		     
			 System.out.println("This Listed prpgram For Deleting ");
		     System.out.println("1.Enter to character");
			 System.out.println("2.Enter Position");
			 
			 System.out.println("");
			 
			 System.out.println("Choose Option if U want To Search ");
		     System.out.println("3.Option Not Availble Yet");
		     System.out.println("4.Option Not Availble Yet ");		  
		     
			 System.out.println("How Many Time U want To Run: ");
			 int r=sc.nextInt();
              
			
		int i;
		 while(r>0)
		 {
			  
			  System.out.println("Choose Option what U want to Enter");
			   int d=sc.nextInt();
			  
		 switch(d)
		 {
			 
			 
			 
			 
              case 1:
			  {
				  System.out.println("Enter Character :  ");
				  char c=sc.next().charAt(0);
				  String s1="";
				  for(i=0;i<n;i++)
				  {
					  if(a[i]!=c)
					  {
					  s1=s1+a[i];
					  }
				  }
				  System.out.println("After Deleting String: "+s1);
					 
				  
              break;
		      }
		  
		  case 2:
		  
		  {
			  System.out.println("Enter the position U want to Delete");
		      int p=sc.nextInt();
			  		for(i=p-1;i<n-1;i++)
		             {
			           a[i]=a[i+1];
		              }
		             n=n-1;
			  System.out.println("After Deleting the String ");
		      for(i=0;i<n;i++)
		       {
			      System.out.print(" "+a[i]);
		          }
			         break;
		  }
		  
		  case 3:
		  {
			  
			  
		  }
		  
		  default:
		  {
			  //System.out.println("Press Enter U If want to Exit");
			  System.exit(0);
		  }
		 
		 }
		 r--;
		 }
		 
		 
		
	}
}
