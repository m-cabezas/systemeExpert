import java.util.ArrayList;

public class BaseFait {

    private ArrayList<Fait> faits;
    public BaseFait() {
        faits = new ArrayList<>();
    }

    public void creer(ArrayList<Fait> faits ) {
        this.faits = faits;
    }

    public void ajouter(Fait fait) {
        if(!faits.contains(fait)) {
            faits.add(fait);
        }
    }

    public Fait un_fait(int index){
        if(index  > faits.size()-1) {
            return  null;
        } else {
            return faits.get(index);
        }

    }



}
