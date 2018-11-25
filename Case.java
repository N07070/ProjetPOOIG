public abstract class Case {
  private boolean occupee;
  private Piece piece;

  public Case(){
    this.occupee = false;
    this.piece = null;
  }

  public boolean estOccupee() {
    return occupee;
  }

  public void PoserPiece(Piece p){
    occupee = true;
    this.piece = p;
  }

  public Piece getPiece() {
    return piece;
  }

  public abstract int getValeur();
}
