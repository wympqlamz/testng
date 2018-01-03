package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("hello");
	}
	
	@Test
	public void getPara() {
		System.out.println("hello2");
	}
	
	@Test
	public void getPara1() {
		System.out.println("hellovvvv2");
	}
}
