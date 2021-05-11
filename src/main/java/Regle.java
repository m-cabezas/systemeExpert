
import java.util.ArrayList;
import java.util.Scanner;

public class Regle {

    private ArrayList<String> premisses;
    private String conclusion;

    public Regle() {
        this.premisses = new ArrayList<>();
        this.conclusion = "";
    }

    public String getConclusion() {
        return conclusion;
    }

    public void creer(ArrayList<String> premisses, String conclusion) {
        //Saisir des premisses tant que l'utilisateur le demande
//        System.out.println("\t Saisir règle : ");
//        boolean suite = true;
//        Scanner keyboard = new Scanner(System.in);
//        while(suite) {
//            System.out.print("\tSaisir premisse : ");
//            premisses.add(keyboard.nextLine());
//            System.out.print("\n\tEncore? (y/n)");
//            String res = keyboard.nextLine();
//            while( !res.equals("y") || !res.equals("n")) {
//                if(res == "y"){
//                    suite = false;
//                }
//
//                res = keyboard.nextLine();
//                System.out.print("\nTaper y ou n");
//            }
//        }
//        //Saisir une conclusion
//        System.out.print("\tSaisir conclusion: ");
//        conclusion = keyboard.nextLine();
        this.premisses = premisses;
        this.conclusion = conclusion;
    }

    public void supprimer(String premisse) {
        premisses.remove(premisse);
    }

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