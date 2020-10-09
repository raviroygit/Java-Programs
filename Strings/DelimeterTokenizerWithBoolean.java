// Delimiter Tokenizer String with boolean condition.

import java.util.*;

class DelimeterTokenizerWithBoolean{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter String = ");
      String str=sc.nextLine();
     

      StringTokenizer st=new StringTokenizer(str,",",true);
      while(st.hasMoreTokens()){
           System.out.println(st.nextToken());
      }
        
    }
}