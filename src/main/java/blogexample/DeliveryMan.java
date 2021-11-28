package blogexample;

public class DeliveryMan {

    private String name;
    private Address address;

    public DeliveryMan(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setAddress(String addressDetail, Integer zipcode) {
        address.addressDetail = addressDetail;
        address.zipCode = zipcode;
    }

}
