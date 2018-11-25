public class PieceDomino extends Piece{
    private Case [] cases;
    private int [] valeur; // entre 0 et 5 inclus

    public PieceDomino(int i, int j) {
        this.valeur = new int[2];
        valeur[0] = i;
        valeur[1] = j;
    }
    public int getValeur(int i) {
        return this.valeur[i];
    }

    @Override
    public String toString() {
        return "[" + valeur[0] + "," + valeur[1] + "]";
    }
}
