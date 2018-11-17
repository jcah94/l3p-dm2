package fr.dm2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Comme vu en cours avec la fonction `generateSpaceTabs()`,
 * pour chaque fonction de la classe {@link ListUtils},
 * testez le cas nominal, vide (cf: 0 et/ou null et/ou ""), et d'erreur.
 * N'oubliez pas d'indiquer le nom des trois blocs dans chacunes de vos fonctions de test (cf: GIVEN/WHEN/THEN)
 */
public class ListUtilsTest {
	private ListUtils listUtils = new ListUtils();

	// TODO: Créez les méthodes de test ICI
	@Test
	public void testCut(){
		//GIVEN
		List<Integer> entier = new ArrayList<Integer>();
		entier.add(1);
		entier.add(2);
		entier.add(3);
		entier.add(4);
		entier.add(5);
		entier.add(6);
		entier.add(7);
		entier.add(8);
		int size = 2;

		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(new ArrayList<Integer>(Arrays.asList(1,2)));
		expected.add(new ArrayList<Integer>(Arrays.asList(3,4)));
		expected.add(new ArrayList<Integer>(Arrays.asList(5,6)));
		expected.add(new ArrayList<Integer>(Arrays.asList(7,8)));

		//WHEN
		List<List<Integer>> actual = listUtils.cut(entier, size);

		// THEN
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCut_emptyArrayList() {
		// GIVEN
		List<Integer> entier = new ArrayList<>();
		List<List<Integer>> expected = new ArrayList<>();
		int size = 10;
		// WHEN
		List<List<Integer>> actual = listUtils.cut(entier,size);
		// THEN
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCut_error() {
		// GIVEN
		List<Integer> entier = null;
		int size = 10;

		// WHEN
		listUtils.cut(entier, size);

		// THEN => EXCEPTION
	}

}
