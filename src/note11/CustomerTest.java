package note11;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	
	@Test
	public void testCreate() {
        Customer c = new Customer("Jane Smith", "Mile End London E1 4NS", new GregorianCalendar(1983, 1, 28));
        assertEquals("Jane Smith", c.getName());
        assertEquals("Mile End London E1 4NS", c.getAddress());
        assertEquals(new GregorianCalendar(1983, 1, 28), c.getDateofBirth());
    }
}