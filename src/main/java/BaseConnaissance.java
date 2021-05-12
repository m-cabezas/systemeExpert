import java.util.ArrayList;

public class BaseConnaissance {
    private ArrayList<Regle> regles;
    public BaseConnaissance() {
        regles = new ArrayList<>();
    }

    /**
     * Crée la base de connaissances avec la liste des règles donnée
     * @param regles liste des règles pour créer la base de connaissances
     */
    public void creer(ArrayList<Regle> regles ) {
        this.regles = regles;
    }

    /**
     * Ajoute la règle donnée à la base de connaissances
     * @param regle à ajouter
     */
    public void ajouter(Regle regle) {
        regles.add(regle);
    }

    /**
     * Revoie la règle à l'indice donnée (si l'indice existe)
     * @param index index de la règle
     * @return la règle ou null si l'index ne correspond à aucune règle
     */
    public Regle une_regle(int index){
        if(index  > regles.size()-1) {
            return  null;
        } else {
            return regles.get(index);
        }

    }
}
