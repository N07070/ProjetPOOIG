import java.util.ArrayList;

public class Joueur  {
    String nom;

    //Dans le constructeur on regarde à quelle variante le joueur joue pour initialiser ses pieces
    public Joueur(String n,String variante){
        try{
            if(!variante.equals("puzzle") && !variante.equals("dominos") && !variante.equals("dominos-gommette") && !variante.equals("saboteur")){
                throw new Exception();
            }
            this.nom = n;
            if(variante.equals("puzzle")){

                ArrayList<PiecePuzzle> pieces = new ArrayList<PiecePuzzle>();

            }

            if(variante.equals("dominos")){

            }

        }
    }
}
