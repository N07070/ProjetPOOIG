public class CaseDomino extends Case {
    int side;

    public CaseDomino(){
        super();
        this.side = -1;
    }

    public void PoserPiece(Piece p, int side){
        super.PoserPiece(p);
        this.side = side;
    }

    @Override
    public void PoserPiece(Piece p) {}

    @Override
    public int getValeur() {
        PieceDomino p = (PieceDomino) getPiece();
        return ((PieceDomino) getPiece()).getValeur(side);
    }
}
