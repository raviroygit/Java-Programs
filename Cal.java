public class Cal{

public int Add(int a,int b)
{
   int result = a+b;
   return result;
}
public static void main(String[] args)
{
	Cal sum= new Cal();
	int result=sum.Add(10,20);
	System.out.println("Sum of two number"+result);
}
}