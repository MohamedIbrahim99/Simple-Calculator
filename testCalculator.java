import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCalculator {

	@Test
	void addTest() {
		Calculator c = new Calculator() ;
		
		int a = c.add(12, 10);
		assertEquals(22,a);
		a = c.add(8, 0);
		assertEquals(8, a);
		a = c.add(5, 8);
		assertEquals(13, a);
	}
		

	void divideTest() throws Exception {
		Calculator d=new Calculator();
		RuntimeException b =assertThrows (RuntimeException.class,() -> d.divide(9, 0));
		assertEquals("Not Allowed !!", b.getMessage());
	}
	
}
