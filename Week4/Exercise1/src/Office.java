public class Office extends Building{
    private String companyName;
    private int numberOfEmployees;

    public Office(String address, String zipCode, String city, int area, String companyName, int numberOfEmployees){
        super(address, zipCode, city, area);
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
    }
}
