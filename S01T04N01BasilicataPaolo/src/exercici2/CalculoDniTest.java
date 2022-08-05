package exercici2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculoDniTest {

	@ParameterizedTest
	@MethodSource("numerosDni")
	void test(String dni, char letra) {
		CalculoDni calculoDni = new CalculoDni();
		assertEquals(letra, calculoDni.CalcularLetra(dni));
	}
	
	
	private static Stream<Arguments> numerosDni(){
		
		return Stream.of(
				Arguments.of("52568821", 'K'),
				Arguments.of("38559741", 'B'),
				Arguments.of("36744146", 'J'),
				Arguments.of("85477745", 'Q'),
				Arguments.of("64548985", 'Z'),
				Arguments.of("46516871", 'S'),
				Arguments.of("12516871", 'H'),
				Arguments.of("56711432", 'X'),
				Arguments.of("74444589", 'Y'),
				Arguments.of("45543336", 'R'));
	}

}
