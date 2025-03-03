public class Building {
    private String address;
    private String zipCode;
    private String city;
    private int area;

    public Building(String address, String zipCode, String city, int area){
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public int getArea() {
        return area;
    }
}
