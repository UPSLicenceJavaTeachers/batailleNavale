package battle;

public class Bateau {
	private String nom;
	private int tailleBateau;
	private char etatBateau = 'S';
	private Element[] structureBateau;

	public Bateau(String nom, int tailleBateau) {
		// super();
		this.nom = nom;
		this.tailleBateau = tailleBateau;
		this.structureBateau = new Element[tailleBateau];
	}

	public void placerBateau(char lettreDebut, int chiffreDebut, char sens) {
		// precondition : sens == 'H' ou sens == 'V'
		assert (sens == 'H') || (sens == 'V');

		for (int index = 0; index < tailleBateau; index++) {
			int chiffreCourant;
			char lettreCourante;
			
			if (sens == 'H') {
				chiffreCourant = chiffreDebut + index;
				lettreCourante = lettreDebut;
			} else {
				chiffreCourant = chiffreDebut;
				lettreCourante = (char) (lettreDebut + index);
			}
			structureBateau[index] = new Element(lettreCourante,chiffreCourant);
		}
	}
public static void main(String[] args) {
	System.out.println("Message");
}
}
