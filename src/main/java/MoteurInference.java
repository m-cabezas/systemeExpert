import java.util.ArrayList;

/**
 * Système Expert
 *
 * @author Cabezas Mathias
 * @author Delahousse Alexandre
 * @author Muré Antoine
 * @author Vieille Chloé
 */
public class MoteurInference {

    public static void main(String[] args) {
        BaseFait baseFaits = new BaseFait();
        BaseConnaissance baseConnaissance = new BaseConnaissance();

        // INITIALISATION

        // Regle 1
        ArrayList<String>  premisses = new ArrayList<>();
        premisses.add("!reservoirVide");
        premisses.add("pharesFonctionnent");
        premisses.add("!moteurDemarre");
        Regle regle1 = new Regle();
        regle1.creer(premisses, "problemeBougie");
        // Regle 2
        premisses = new ArrayList<>();
        premisses.add("!moteurDemarre");
        premisses.add("!pharesFonctionnent");
        Regle regle2 = new Regle();
        regle2.creer(premisses, "problemeBatterie");
        // Regle 3
        premisses = new ArrayList<>();
        premisses.add("!moteurDemarre");
        premisses.add("pharesFonctionnent");
        Regle regle3 = new Regle();
        regle3.creer(premisses, "problemeStarter");

        // Ajout des règles à la base de connaissance
        baseConnaissance.ajouter(regle1);
        baseConnaissance.ajouter(regle2);
        baseConnaissance.ajouter(regle3);

        // Création des faits
        ArrayList<Fait> faits = new ArrayList<>();
        faits.add(new Fait("!reservoirVide"));
        faits.add(new Fait("pharesFonctionnent"));
        faits.add(new Fait("!moteurDemarre"));

        // Ajout des faits à la base de faits
        baseFaits.creer(faits);

        // ALGORITHME
        int i = 0;
        while (baseFaits.un_fait(i) != null) {
            int j = 0;
            Fait fait = baseFaits.un_fait(i);
            while (baseConnaissance.une_regle(j) != null) {
                Regle regle = baseConnaissance.une_regle(j);
                if(regle.appartient(fait.getFait())) {
                    regle.supprimer(fait.getFait());
                }
                if(regle.vide()) {
                    baseFaits.ajouter(new  Fait(regle.getConclusion()));
                }
                j++;
            }
            i++;
        }

        // Conclusion
        i = 0;
        while (baseFaits.un_fait(i) != null) {
            System.out.println(baseFaits.un_fait(i).getFait());
            i++;
        }

    }
}
