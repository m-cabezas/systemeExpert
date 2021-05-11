import java.util.ArrayList;

public class MoteurInference {

    public static void main(String[] args) {
        BaseFait baseFaits = new BaseFait();
        BaseConnaissance baseConnaissance = new BaseConnaissance();

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

        baseConnaissance.ajouter(regle1);
        baseConnaissance.ajouter(regle2);
        baseConnaissance.ajouter(regle3);

        ArrayList<Fait> faits = new ArrayList<>();
        faits.add(new Fait("!reservoirVide"));
        faits.add(new Fait("pharesFonctionnent"));
        faits.add(new Fait("!moteurDemarre"));

        baseFaits.creer(faits);

        // Code
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
