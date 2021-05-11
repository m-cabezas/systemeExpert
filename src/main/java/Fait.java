public class Fait {
    private String fait;

    public Fait(String fait){
        this.fait = fait;
    }

    public void setFait(String fait){
        this.fait = fait;
    }

    public String getFait(){
        return fait;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if( !(o instanceof Fait)) {
            return false;
        }
        return this.getFait().equals(((Fait) o).getFait());
    }
}