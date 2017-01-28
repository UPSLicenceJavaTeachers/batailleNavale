package battle;

public class Jeu {
	private static final int JOUEUR2 = 2;
	private static final int JOUEUR1 = 1;
	private Grille grilleJoueur1;
	private Grille grilleJoueur2;

	public void initialiser(int numJoueur, String nomBateau, int tailleBateau, char lettre, int chiffre, char sens) {
		assert (numJoueur == JOUEUR1) || (numJoueur == JOUEUR2);

		Bateau b = new Bateau(nomBateau, tailleBateau);
		Grille grille;
		if (numJoueur == JOUEUR1)
			grille = grilleJoueur1;
		else
			grille =grilleJoueur2;
		grille.placerBateau(b, sens, lettre, chiffre);
	}
}
