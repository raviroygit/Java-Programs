// Remove UpperCase From String?
//Some issue if upper letter greater than Smaller then not work.

import java.util.*;

class RemoveUpperCase{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String ");
        String str=sc.nextLine();

        char[] a=str.toCharArray();

        int delcount=0;
        int len1=a.length;
        for(int i=0;i<a.length;i++){
              for(int j=i;j<a.length;j++){
                  if(a[i]>=65 && a[i]<=90){
                      shift(a,j);
                      delcount++;
                      len1--;
                  }
                 

              }
        }
        int len=str.length();
        if(len>=delcount){
        str=new String(a);
        
        System.out.println("String length = "+len);
        System.out.println("Total UpperCase Letter Deleted = "+delcount);
        str=str.substring(0, str.length() - delcount);

        System.out.println("After Remove UpperaseString=  "+str);
        }
        else 
           System.out.println("Please Try Different String! ");

sc.close();
    }
    private static void shift(char a[],int index){
        for(int i=index;i<a.length-1;i++)
        {
            // Shift Upper case in last of string
            a[i]=a[i+1];
        }
    }
}