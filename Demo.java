package iterator;

public class Demo {
	public static void main(String[] args)
	{
		MaCollection maCollection = new MaCollection();
		maCollection.ajouter("Cette collection");
		maCollection.ajouter("contient un ensemble");
		maCollection.ajouter("de String.");
		
		/*
		 * La méthode imprimer() reçoit un Iterable. Dans ce cas, l'implémentation
		 * concrète de l'Itérable est une instance de la classe MaCollection.
		 * Celle-ci utilise un tableau pour garder ses éléments. Cependant, 
		 * la méthode imprimer() n'a aucune connaissance de ce fait, car elle 
		 * utilise un Iterateur pour parcourir la collection. 
		 */
		MonClient.imprimer(maCollection);
		
		UneAutreCollection uneAutreCollection = new UneAutreCollection();
		uneAutreCollection.ajouter("");
		uneAutreCollection.ajouter("Cette collection");
		uneAutreCollection.ajouter("contient aussi plusieurs String.");
		
		/*
		 * La méthode imprimer() reçoit encore un Iterable. Dans ce cas, l'implémentation
		 * concrète de l'Itérable est une instance de la classe UneAutreCollection.
		 * Celle-ci utilise une liste chainée pour garder ses éléments. Cependant, 
		 * la méthode imprimer() n'a aucune connaissance de ce fait, car elle 
		 * utilise un Iterateur pour parcourir la collection. 
		 * 
		 * Ainsi, quelque soit la façon dont la collection est implémentée (tableau ou
		 * liste chainée), la méthode imprimer() fonctionne quand même. Elle est indépendante
		 * de l'implémentation spécifique de la collection. Ceci est l'objectif recherché
		 * par de l'utilisation du patron Iterator.
		 */
		MonClient.imprimer(uneAutreCollection);
	}

}
