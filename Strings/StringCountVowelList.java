import java.util.*;


public class StringCountVowelList {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String ");
        String str=sc.nextLine();

          int len=str.length();
          char a[]=new char[len];
          a=str.toCharArray();
           
          int countVowel=0,countWord=0;
          
          System.out.println("Vowels in String are ");
        for(int i=0;i<len;i++){
            countWord++;

            if (a[i] == 'a' ||a[i]== 'e' || a[i] == 'i' || a[i] == 'o' || a[i]== 'u'
        || a[i]=='A'|| a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                   
            System.out.print(""+a[i]+" ");
                  countVowel++;
        }}
        
        System.out.println("\ntotal Vowels in String are "+countVowel);
        System.out.println("total Words in String are  "+countWord);
        sc.close();
    }
    
    
}
