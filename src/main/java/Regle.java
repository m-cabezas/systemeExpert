
import java.util.ArrayList;
import java.util.Scanner;

public class Regle {

    private ArrayList<String> premisses;
    private String conclusion;

    public Regle() {
        this.premisses = new ArrayList<>();
        this.conclusion = "";
    }

    /**
     * Donne la conclusion de la règle
     * @return la conclusion de la règle
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * Crée la règle
     * @param premisses liste des premises
     * @param conclusion la conclusion de la règle
     */
    public void creer(ArrayList<String> premisses, String conclusion) {
        this.premisses = premisses;
        this.conclusion = conclusion;
    }

    /**
     * Suprrime de la règle la premisse passée en paramètre
     * @param premisse la premisse à supprimer
     */
    public void supprimer(String premisse) {
        premisses.remove(premisse);
    }

    /**
     * Indique si la règle a encore des premisses
     * @return true si la liste est vide, false sinon
     */
    public boolean vide() {
        return premisses.isEmpty();
    }

    /**
     * Indique si la premisse passée en paramètre appartient à la règle
     * @param premisse est la premisse dont on vérifie l'existence
     * @return true si la premisse est présente, false sinon
     */
    public boolean appartient(String premisse) {
        return premisses.contains(premisse);
    }

}