package practice;

import org.testng.annotations.Test;

public class Create_Test
{
	@Test
	public void create()
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
		
	}
	

}
