import java.util.ArrayList;

public class BaseFait {

    private ArrayList<Fait> faits;
    public BaseFait() {
        faits = new ArrayList<>();
    }

    /**
     * Crée la base de faits avec la liste fournies
     * @param faits la liste des faits pour créer la base de faits
     */
    public void creer(ArrayList<Fait> faits ) {
        this.faits = faits;
    }

    /**
     * Ajoute un fait à la base de faits s'il n'existe pas déjà
     * @param fait fait à ajouter
     */
    public void ajouter(Fait fait) {
        if(!faits.contains(fait)) {
            faits.add(fait);
        }
    }

    /**
     * Renvoie le fait à l'indice donnée s'il existe
     * @param index index du fait souhaité
     * @return le fait s'il existe, null sinon
     */
    public Fait un_fait(int index){
        if(index  > faits.size()-1) {
            return  null;
        } else {
            return faits.get(index);
        }

    }



}
