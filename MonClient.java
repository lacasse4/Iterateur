package iterator;

public class MonClient {
	
	/**
	 * Imprime le contenu d'un Iterable
	 * 
	 * Cette méthode démontre l'utilisation du patron Itérateur.
	 * La méthode imprimer() a la capacité d'imprimer n'importe quelle 
	 * collection qui implémente l'interface Iterable. Elle est donc
	 * indépendante du type spécifique de la collection qui est passée
	 * en paramètre.
	 * 
	 * Voir la classe Demo pour l'exemple complet.
	 * 
	 * @param unIterable
	 */
	public static void imprimer(Iterable unIterable)
	{
		Iterateur i = unIterable.createIterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
}
