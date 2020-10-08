// Find length of String and Take User Input string?


import java.util.*;

class SortString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Strings  ");
        String str = sc.nextLine();
        String str1;
        str1=str;
        char a[]=str.toCharArray();
        char a1[]=str.toCharArray();

        //Accendin Order Sortig 
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1])
            {
                char temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            }
        }
      

        str=new String(a);

        System.out.println("Strings Sorted(in Accending Order)=  "+str);

        // for Deccending Order Sorting
        for(int i=0;i<a1.length;i++){

            for(int j=0;j<a1.length-1;j++){
                if(a1[j]<a1[j+1])
            {
                char temp=a1[j];
                a1[j]=a1[j+1];
                a1[j+1]=temp;
            }
            }
        }
        str1=new String(a1);
        System.out.println("Strings Sorted(in Deccending Order)=  "+str1);
        sc.close();
        
    }
}