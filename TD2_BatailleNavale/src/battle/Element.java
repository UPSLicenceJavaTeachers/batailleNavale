package battle;

public class Element {
//	JDK : Java Development Kit
//	JRE : Java Runtime Environment

	private char lettre;
	private int chiffre;
	private boolean elementTouche = false;
	
	public Element(char lettre, int chiffre) {
//		super();
		this.lettre = lettre;
		this.chiffre = chiffre;
	}

	public boolean verifieCoordonnees (char lettreAComparer, int chiffreAComparer){
		return (lettre==lettreAComparer && chiffre==chiffreAComparer);
	}

	public boolean isElementTouche() {
		return elementTouche;
	}

	public void touche() {
		elementTouche = true;
	}
	public static void main(String[] args) {
		char l = 'a'; int c = 3;
	
		System.out.println("Construction de l'element "+ l+","+c);
		Element e= new Element(l,c);
		System.out.println("Element est touché ? "+e.isElementTouche());
		System.out.println();
	}
}
