public class Office extends Building{
    private String companyName;
    private int numberOfEmployees;

    public Office(String address, String zipCode, String city, int area, String companyName, int numberOfEmployees){
        super(address, zipCode, city, area);
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Office of " + this.companyName + " with " + this.companyName + " employees, Address: " + getAddress() + " , Zip code: " + getZipCode() + ", City: " + getCity() + ", Area: " + getArea() + " m2\n";
    }

}
