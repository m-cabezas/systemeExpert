import java.util.ArrayList;

public class BaseConnaissance {
    private ArrayList<Regle> regles;
    public BaseConnaissance() {
        regles = new ArrayList<>();
    }

    public void creer(ArrayList<Regle> regles ) {
        this.regles = regles;
    }

    public void ajouter(Regle regle) {
        regles.add(regle);
    }

    public Regle une_regle(int index){
        if(index  > regles.size()-1) {
            return  null;
        } else {
            return regles.get(index);
        }

    }
}
