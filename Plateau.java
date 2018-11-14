public class Plateau {
  private Case [][] plateau;

  public Plateau(int hauteur, int longueur){
    this.plateau = new Case[hauteur - 1][longueur - 1];
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

}
