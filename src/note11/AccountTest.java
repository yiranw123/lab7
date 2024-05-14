package note11;

import static org.junit.jupiter.api.Assertions.*;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
	 private Customer c;
	   private Account acc;
	
	@BeforeEach
	void setUp() {
		c = new Customer("Jane Smith", "Mile End London E1 4NS",
	             new GregorianCalendar(1983,1,28));
	      acc = new Account (12345678, c);
	}

	
	@Test
	   public void testCreate() {
	         assertEquals(12345678, acc.getAccNo());
	         assertEquals(c, acc.getCustomer());	
	         assertEquals(0.0,acc.getBalance());	
	         assertFalse(acc.isSuspended());	
	         assertNotNull(acc.getPin());	
	   }

}



