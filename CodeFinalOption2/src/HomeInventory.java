public class HomeInventory {
    private int square_feet;
    private String address;
    private String city;
    private String state;
    private int zip_code;
    private String Model_name;
    private String sale_status;

    public HomeInventory(int square_feet, String address, String city,
    String state, int zip_code, String Model_name, String sale_status) {
        this.square_feet = square_feet;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.Model_name = Model_name;
        this.sale_status = sale_status;

    }
}