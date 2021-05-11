
import java.util.ArrayList;

public class Regle {

    private ArrayList<String> premisses;
    private String conclusion;

    public Regle() {
        this.premisses = new ArrayList<>();
        this.conclusion = "";
    }

    public void creer() {
        //Saisir des premisses tant que l'utilisateur le demande
        //Saisir une conclusion
    }

    public void supprimer(String premisse) {
        // Détruire la règle ou supprimer une premisse?
    }

    /**
     * Indique si la premisse passée en paramètre appartient à la règle
     * @param premisse est la premisse dont on vérifie l'existence
     * @return true si la premisse est présente false sinon
     */
    public boolean appartient(String premisse) {
        return premisses.contains(premisse);
    }

}