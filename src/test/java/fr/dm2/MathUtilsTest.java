package fr.dm2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Comme vu en cours avec la fonction `generateSpaceTabs()`,
 * pour chaque fonction de la classe {@link MathUtils},
 * testez le cas nominal, vide (cf: 0 et/ou null et/ou ""), et d'erreur.
 * N'oubliez pas d'indiquer le nom des trois blocs dans chacunes de vos fonctions de test (cf: GIVEN/WHEN/THEN)
 * Vous ne devrez PAS modifier la classe {@link MathUtils}, mais observez attentivement l'implémentation des méthodes de la classe {@link MathUtils}
 */
public class MathUtilsTest {
	private MathUtils mathUtils = new MathUtils();

	// TODO: Créez les méthodes de test ICI

	@Test
	public void powerTest(){
		//GIVEN
		int number = 2;
		int pow = 6;
		int expected = 64;
		//WHEN
		int actual = mathUtils.power(number,pow);
		//THEN
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void factorialTest(){
		//GIVEN
			int n = 3;
			int expected = 6;
		//WHEN
		int actual = mathUtils.factorial(n);
		//THEN
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void fibonacciTest(){
		//GIVEN
		int n = 3;
		int expected = 2;
		//WHEN
		int actual = mathUtils.fibonacci(n);
		//THEN
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFactorial_error() {
		// GIVEN
		int n = (-6);
		// WHEN
		mathUtils.factorial(n);

		// THEN => EXCEPTION
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testFibonacci_error() {
		// GIVEN
		int n = (-7);
		// WHEN
		mathUtils.fibonacci(n);

		// THEN => EXCEPTION
	}
}
