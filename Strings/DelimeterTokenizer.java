// Delimiter Tokenizer String with some condition.

import java.util.*;

class DelimeterTokenizer{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter String = ");
      String str=sc.nextLine();
      System.out.println("Enter Delimeter Character = ");
      String e=sc.nextLine();

      StringTokenizer st=new StringTokenizer(str,e);
      while(st.hasMoreTokens()){
           System.out.println(st.nextToken());
      }
        
    }
}