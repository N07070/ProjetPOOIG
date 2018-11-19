public class Plateau {
  private Case [][] plateau;
  private int hauteur; // correspond à i
  private int longueur; // correspond à j

  public Plateau(int hauteur, int longueur){
    this.hauteur = hauteur;
    this.longueur = longueur;
    this.plateau = new Case[hauteur][longueur];
    for (int i = 0; i < hauteur; i++) {
      for (int j = 0; j < longueur; j++) {
        this.plateau[i][j] = new Case();
      }
    }
  }

  public Plateau(int hauteur){
    this(hauteur, hauteur);
  }

  public Plateau(){
    this(10);
  }

  public Case getCase(int i, int j){
    return plateau[i][j];
  }

  public void afficher(){
    /*
    for (int i = 0; i < longueur; i++) {
      System.out.print("-");
    }
    for (int i = 0; i < hauteur; i++) {
      for (int j = 0; j < longueur; j++) {
        
      }
    }
    */
  }
}
