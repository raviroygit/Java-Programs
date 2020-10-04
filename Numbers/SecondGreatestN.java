import java.util.*;

class SecondGreatestN{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter all number! ");
        int n=sc.nextInt();

        System.out.println("Enter the Number");
        int n2=0,s=0,G;
        for(int i=0;i<n;i++){
            G= sc.nextInt();
            if(G>=n2)
            { 
                s=n2;
                n2=G;
            }
            else if(G>=s)
            {
               s=G;
                
            }
            
        }
        System.out.println("Greatest number= "+n2);
        System.out.println("Second Greatest number= "+s);
        sc.close();


        


    }
}