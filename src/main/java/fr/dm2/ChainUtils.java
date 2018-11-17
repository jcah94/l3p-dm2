package fr.dm2;

/**
 * TODO: Implémentez les méthodes de la classe courante. Vous n'avez pas le droit de modifier la signature des méthodes.
 */
public class ChainUtils {

	/**
	 * Prend une chaine de caractères en paramètre et retourne le mot avec la première lettre en majuscule.
	 *
	 * Ex: en entrée "jE sUIS baTMan" retournera "Je Suis Batman"
	 *
	 * @param chain		Chaine de caractères
	 * @return
	 */
	public String capitalize(String chain) {
		// TODO
		if (chain == null){
			throw new IllegalArgumentException("La chain est null et ne doit pas l'etre.");
		}
		String mytab[] = chain.split(" ");
		String phrase = "";

		for(String item : mytab){
			String output = item.substring(0, 1).toUpperCase() + item.substring(1).toLowerCase();
			phrase = phrase + output + " " ;
		}

		phrase = phrase.trim();
		return phrase;
	}
}
