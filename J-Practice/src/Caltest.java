import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
 
class Caltest {
 
	@Test
	void test() {
		Calculator c = new Calculator();
		int r=c.sum(2,5);
		int e=7;
		assertEquals(e, r);

	}
	
	@Test
	void fact() {
		Calculator c = new Calculator();
		assertEquals(120,c.fact(5));
	}
	
	@Test
	void test1()
	{
		Calculator c = new Calculator();
		boolean flag=c.isAgeValid(12);
		assertFalse(flag);
 
		
	}
   
	@Test
	void testItem()
	{
		Calculator c = new Calculator();
 
		 String str= c.getItemById(101);
		 assertNotNull(str);
	}
	
	@Test
	void testItem2()
	{
		Calculator c = new Calculator();
 
		 String str= c.getItemById(107);
		 assertNull(str);
	}
}