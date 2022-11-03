package projet1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import projet1.Calculatrice;

class CalculatriceTest {
	
	@Test
	@DisplayName("test Add 1 + 2")
	void testAdd1() {
		Calculatrice calc = new Calculatrice();
		assertEquals(3, calc.add(1, 2), "Test 1+2, valeur attendue: 3");
	}
	
	@Test
	@DisplayName("test Add Max")
	void testAddMax() {
		Calculatrice calc = new Calculatrice();
		assertEquals(Integer.MAX_VALUE, calc.add(Integer.MAX_VALUE, 1), "Test MAX_VALUE + 1, en cas de valeur>max, valeur attendue: MAX_VALUE");
	}
	
	@Test
	@DisplayName("test Add Min")
	void testAddMin() {
		Calculatrice calc = new Calculatrice();
		assertEquals(Integer.MIN_VALUE, calc.add(Integer.MIN_VALUE, -1), "Test MIN_VALUE + (-1), en cas de valeur<min, valeur attendue: MIN_VALUE");
	}
	
	@Test
	@DisplayName("test Add Zero")
	void testAddZero() {
		Calculatrice calc = new Calculatrice();
		assertTrue(calc.add(-1, 1)>0, "Test du resultat = 0, valeur attendue: 1~100");
		assertTrue(calc.add(-1, 1)<101, "Test du resultat = 0, valeur attendue 1~100");
	}
	
	@Test
	@DisplayName("Test parité")
	void testPaire() {
		Calculatrice calc = new Calculatrice();
		assertTrue(calc.isPair(2), "Test de la parité de 2, valeur attendue: TRUE");
	}
	
	@Test
	@DisplayName("Test non parité")
	void testNonPaire() {
		Calculatrice calc = new Calculatrice();
		assertFalse(calc.isPair(3), "Test de la parité de 3, valeur attendue: FALSE");
	}
}
