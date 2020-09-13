class Demo
{
	public static void main(String args[])
	{
		Vehicle obj=new MotorBike();
		obj.move();
		
		obj=new Vehicle();
		obj.move();
		
	
	}
	class Vehicle{
		
		public void move()
		{
			System.out.println("Vehicle can Move!!!");
		}
	}
	
	class MotorBike extends Vehicle {
		
		public void move(){
			
			System.out.println("MOtorBIke Can move Accelarate too!");
		}
	}
	
	
	
	
	
	
	
	
	
	
}