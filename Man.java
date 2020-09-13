 // polymprphism Example part 1 

class Man
{
	public void pay()
	{
		System.out.println("Paying Bills");
	}

   	public static void main(String args[])
	{
		
		Man obj = new Millionare();
		//obj.millionare();
		obj.pay();
		Millionare st=new Students();
		st.pay();
		
	}

 
 
 }
class Millionare extends Man
{
	
	public void pay()
	{
		System.out.println("Miullionare Paying billS");
		
	}
	
	

}
class Students extends Millionare
{
	public void pay()
	{
		System.out.println("Students Paying Fees Of college");
	}
}






