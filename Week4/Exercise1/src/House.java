public class House extends Building{
    private String owner;
    private boolean hasGarage;
    private int price;

    public House(String address, String zipCode, String city, int area, String owner, boolean hasGarage, int price){
        super(address, zipCode, city, area);
        this.owner = owner;
        this.hasGarage = hasGarage;
        this.price = price;
    }
}
