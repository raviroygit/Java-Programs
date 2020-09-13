// check ip adsdress

import java.net.InetAddress;

public class Ipcheck
{
	public static void main(String args[])
	{
		InetAddress ip=InetAddress.getLocalHost();
		System.out.print(" Ip Address: "+ip.getHostAddress());
		
	}
}