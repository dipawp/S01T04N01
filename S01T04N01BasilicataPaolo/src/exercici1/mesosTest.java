package exercici1;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class mesosTest {

	@Test
	void assertTotalMesos() {
		Mesos mesos = new Mesos();
		assertEquals(12,mesos.llistaMesos.size());
		
	}
	
	@Test
	void assertNoNull() {
		Mesos mesos = new Mesos();
		assertNotNull(mesos.llistaMesos);
	}
	
	@Test
	void assertOrder() {
		Mesos mesos = new Mesos();
		assertEquals("agost", mesos.llistaMesos.get(7));
	}

}
