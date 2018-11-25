public abstract class Plateau {
  private Case [][] plateau;
  protected int hauteur; // correspond à i
  protected int longueur; // correspond à j

  public Plateau(int hauteur, int longueur){
      if (hauteur > 99) {
          hauteur = 99;
      }
      if (longueur > 99) {
          longueur = 99;
      }
      this.hauteur = hauteur;
      this.longueur = longueur;
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

  public void setCase(int i, int j, Case c){
      this.plateau[i][j] = c;
  }

  public void setPlateau(Case[][] plateau) {
      this.plateau = plateau;
  }

  public abstract void afficher();
}
