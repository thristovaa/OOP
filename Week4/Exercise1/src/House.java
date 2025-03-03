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

    public String getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public boolean getGarage() {
        return hasGarage;
    }

    @Override
    public String toString() {
        return "House of " + this.owner + " " + (this.hasGarage ? "with" : "without") + " garage, price: EUR " + this.price + ", Address: " + getAddress() + " , Zip code: " + getZipCode() + ", City: " + getCity() + ", Area: " + getArea() + " m2\n";
    }
}
