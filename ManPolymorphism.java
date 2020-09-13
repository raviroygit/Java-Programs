 // polymprphism Example part 1

class Man
{
	public void pay()
	{
		System.out.println("Paying Bills");
	}

 
 
 
 
 static class Millionare extends Man
{
	
	public void pay()
	{
		System.out.println("Miullionare Paying billS");
		
	}
}


	public static void main(String args[])
	{
		
		Man obj = new Millionare();
		//obj.millionare();
		obj.pay();
		
	}




}
