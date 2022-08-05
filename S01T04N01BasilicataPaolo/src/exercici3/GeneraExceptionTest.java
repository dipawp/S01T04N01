package exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeneraExceptionTest {

	@Test
	void test() {
		Assertions.assertThrowsExactly(ArrayIndexOutOfBoundsException.class,() -> GeneraException.genException());
		//Assertions.assertThrows(null, null);
	}

	
}
