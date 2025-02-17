package demo;

public class AutoITDemo {
 
	public static void main(String[] args) throws Exception
	{
		testabcd();
	}
	
	@SuppressWarnings("deprecation")
	public static void testabcd() throws Exception
	{
		
		Runtime.getRuntime().exec("D:\\firstuse.exe");
		Thread.sleep(3000);
		
		
		
	}
}
