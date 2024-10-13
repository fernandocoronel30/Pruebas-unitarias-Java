import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasUnitarias {
	Calculadora calc = new Calculadora();
	
	@Test
	@DisplayName("Prueba para capturar una exception")
	void pruebaException() {
		assertEquals(3, calc.divide(9, 3));
		assertEquals(5, calc.divide(25, 5));
		
		Exception e = assertThrows(ArithmeticException.class, 
				() -> calc.divide(10,0));
		assertEquals("/ by zero", e.getMessage());
	}//pruebaException
	
	@Test
	@DisplayName("Prueba que el valor de PI no sea null")
	void PruebaString() {
		assertNotNull(calc.getPIStr());
	}//pruebaString
	
	@Test
	@DisplayName("Prueba que el valor de PI se encuentre dentro de un rango aceptable")
	void PruebaBooleana() {
		assertTrue(calc.getPI() >= 3.14);
		assertTrue(calc.getPI() <= 3.1416);
	}//pruebaBooleana
	
	@Test
	@DisplayName("Prueba la suma de dos números enteros")
	void pruebaSumarEnteros() {
		assertEquals(4, calc.suma(2, 2));
		assertEquals(128, calc.suma(64, 64));
		assertEquals(25, calc.suma(20, 5));
		assertEquals(70, calc.suma(50, 20));
	}//PruebaSumaEnteros
}//class PruebasUnitarias
