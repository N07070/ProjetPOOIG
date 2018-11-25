public class Puzzle extends Jeu {
  private Plateau courant;  // Plateau à remplir par le joueur
  private Plateau solution; // Plateau déjà rempli qui est solution
  private Joueur joueur;

  @Override
  public void lancerPartie() {
      System.out.println("-- Partie de Puzzle --" + "\n");

      // Création du Joueur
      this.setJoueur();

      // Création du plateau solution

      // Remplissage de solution

      // Création du plateau courant

  }

  @Override
  public void joueUnTour(Joueur j) {

  }

  @Override
  public void setJoueur() {
      System.out.println("Quel est le nom du joueur ?");
      this.joueur = new Joueur();
  }
}
