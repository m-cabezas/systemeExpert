import java.util.ArrayList;

public class BaseFait {

    private ArrayList<String> faits;
    public BaseFait() {
        faits = new ArrayList<>();
    }

    public void creer(ArrayList<String> faits ) {
        this.faits = faits;
    }

    public void ajouter(String fait) {
        if(!faits.contains(fait)) {
            faits.add(fait);
        }
    }

    public String un_fait(int index){
        if(index  > faits.size()-1) {
            return  null;
        } else {
            return faits.get(index);
        }

    }
}
