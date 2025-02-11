package characters;

import java.util.ArrayList;
import java.util.Arrays;



public class NameRepository {

	private ArrayList<String> values = new ArrayList<String>(Arrays.asList(
	        "Alice", "Bob", "Charlie", "David", "Emma", "Félix", "Gabriel", "Hugo", "Isabelle", "Julia",
	        "Kevin", "Léa", "Maxime", "Nina", "Oscar", "Paul", "Quentin", "Raphaël", "Sophie", "Thomas",
	        "Ulysse", "Victor", "William", "Xavier", "Yasmine", "Zacharie",
	        "Amélie", "Baptiste", "Clara", "Damien", "Élodie", "Fabien", "Gisèle", "Henri", "Inès", "Jules",
	        "Karim", "Laura", "Marine", "Nicolas", "Olivier", "Pierre", "Quentin", "Romain", "Sarah", "Théo",
	        "Ugo", "Vanessa", "Wendy", "Xéna", "Yohan", "Zoé", "Adrien", "Bruno", "Cécile", "Dorian",
	        "Émile", "Florian", "Géraldine", "Héloïse", "Igor", "Jean", "Katia", "Lilian", "Mélanie",
	        "Nathan", "Ophélie", "Patrice", "Quitterie", "Roxane", "Stéphane", "Thierry", "Uranie",
	        "Valentin", "Wassim", "Xander", "Yvan", "Zora", "Antoine", "Béatrice", "Cyril", "Delphine",
	        "Étienne", "François", "Gustave", "Hector", "Iris", "Jacques", "Kim", "Louis", "Maëlle"
	    ));

	private static NameRepository instance = new NameRepository();


	private NameRepository() {

	}
	public static NameRepository getInstance() {
		return instance;
	}


	public void register(String name) {
		values.add(name);
	}


	public String getValue(int n) {
		return values.get(n);
	}

}
