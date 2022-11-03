package projet1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import projet1.Calculatrice;

class CalculatriceTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("beforeAll 0");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("afterAll 2");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("beforeEach 3");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("afterEach 4");
	}

	@Test
	void test() {
		System.out.println("test 1");
	}
	
	@Test
	void testAdd() {
		Calculatrice calc = new Calculatrice();
		int resultat = calc.add(1, 2);
		System.out.println("Resultat = "+resultat);
	}
	
	@Test
	void testRmv() {
		Calculatrice calc = new Calculatrice();
		int resultat = calc.rmv(2, 1);
		System.out.println("Resultat = "+resultat);
	}


}
