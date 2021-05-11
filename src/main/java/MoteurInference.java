import java.util.ArrayList;

public class MoteurInference {

    public static void main(String[] args) {
        BaseFait baseFaits = new BaseFait();
        ArrayList<Regle> baseConnaissance = new ArrayList<>();

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
        premisses.add("moteurDemarre");
        Regle regle3 = new Regle();
        regle3.creer(premisses, "problemeStarter");

        baseConnaissance.add(regle1);
        baseConnaissance.add(regle2);
        baseConnaissance.add(regle3);

        ArrayList<String> faits = new ArrayList<>();
        faits.add("!reservoirVide");
        faits.add("pharesFonctionnent");
        faits.add("!moteurDemarre");

        baseFaits.creer(faits);

        int i = 0;
        while (baseFaits.un_fait(i) != null) {
            String tmpFait = baseFaits.un_fait(i);
            for (Regle regle : baseConnaissance) {
                if(regle.appartient(tmpFait)) {
                    regle.supprimer(tmpFait);
                }
                if(regle.vide()) {
                    baseFaits.ajouter(regle.getConclusion());
                }
            }
            i++;
        }

        // Conclusion
        i = 0;
        while (baseFaits.un_fait(i) != null) {
            System.out.println(baseFaits.un_fait(i));
            i++;
        }

    }
}
