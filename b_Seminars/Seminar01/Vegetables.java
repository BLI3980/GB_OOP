public class Vegetables extends Product{
    private String origin;

    public Vegetables(String name, double price, String origin) {
        super(name, price);
        this.setOrigin(origin);
    }

    public String getOrigin(){
        return origin;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }

    @Override
    public String toString() {
        return String.format("%s; Country of origin: %s", super.toString(), origin);
    }
}
