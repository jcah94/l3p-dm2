package fr.dm2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO: Implémentez les méthodes de la classe courante. Vous n'avez pas le droit de modifier la signature des méthodes de la classe courante..
 */
public class ListUtils {

	/**
	 * Prend une liste en paramètre, la découpe et retourne une liste de liste avec la taille indiquée.
	 *
	 * Ex: en entrée j'ai une liste de 41 éléments, j'indique la taille (size) de découpage à 10,
	 * et j'obtiens en sortie une liste de 5 listes dont les 4 premières listes contiennent 10 éléments et la dernière liste 1 élément
	 *
	 * @param list		Une liste
	 * @param size		Taille désirée
	 * @return
	 */
	public <T> List<List<T>> cut(List<T> list, int size) {
		// TODO
		if (list == null){
			throw new IllegalArgumentException("Le tableau est null.");
		}
		List<T> liste = new ArrayList<T>();
		List<List<T>> returnList = new ArrayList<List<T>>();
		int max = 0;
		Boolean check = false;

		for (T item: list) {
			if (max == size) {
				returnList.add(new ArrayList<T>(liste.subList(0, size)));
				max = 0;
				liste.clear();
				liste.add(item);
			}else{
				liste.add(item);
			}
			max = max + 1;
			check = true;
		}
		if(check){
			returnList.add(liste.subList(0, liste.size()));
		}
		return returnList;
	}
}
