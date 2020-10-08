import java.util.*;


public class CountVowelConsonent {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String ");
        String str=sc.nextLine();

          int len=str.length();
          char a[]=new char[len];
          a=str.toCharArray();
           
          int countVowel=0,countConsonents=0,number=0,space=0;
          
          System.out.println("Vowels in String are ");
        for(int i=0;i<len;i++){
            
            if(a[i]==' ')
               space++;
            if(a[i]>='0' && a[i]<='9')
                 number++;
            if (a[i] == 'a' ||a[i]== 'e' || a[i] == 'i' || a[i] == 'o' || a[i]== 'u'
        || a[i]=='A'|| a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                   
            System.out.print(""+a[i]+" ");
                  countVowel++;
        }else 
            countConsonents++;
    }
        
       System.out.println("\ntotal space in String are "+space);
        System.out.println("\ntotal numbers in String are "+number);

        System.out.println("\ntotal Vowels in String are "+countVowel);
        System.out.println("total Consonents in String are  "+countConsonents);
        sc.close();
    }
    
    
}
