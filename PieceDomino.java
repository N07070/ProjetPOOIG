public class PieceDomino extends Piece{
    private Case [] cases;
    private int [] valeur; // entre 0 et 5 inclus

    public PieceDomino(Case[] cases, int[] valeur) {
        this.cases = cases;
        this.valeur = valeur;
    }
    public int getValeur(int i){
        return this.valeur[i];
    }

}
