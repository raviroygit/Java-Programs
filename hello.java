public class hello{
	
	
	public  void nonStaticTest()
	{
		System.out.println("NonStaticTest");
	}
	public static void Roy()
	{
		System.out.println("StaticMethod");
	}
	
	
   public static void main(String[] args)
   {
	   hello helloworldobject=new hello();
	   
       System.out.println("HelloWorld");
       helloworldobject.nonStaticTest();
	   Roy();
   }
   
}