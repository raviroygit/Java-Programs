// Find most Occunring Character in String?
import java.util.*;

public class FindMostOccuringChar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String ");
        String str=sc.nextLine();

        int index=0;
        char a[]=new char[256];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
                a[str.charAt(i)]++;
        }
        int max=0;
        for(int i=0;i<256;i++){
            if(a[i]>=max){
                max=a[i];
                index=i;
            }
        }
        
        System.out.println("Most Occuring Char\n " + (char)index + ":" + max + " times Occurs");
        sc.close();
    }
    
}
