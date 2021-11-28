package blogexample;

public class Order {

    private Address userAddress;
    private AddressValidator addressValidator;

    public Order(Address userAddress, AddressValidator addressValidator) {
        this.userAddress = userAddress;
        this.addressValidator = addressValidator;
    }

    public void setAddress(String address, Integer zipcode) {
        userAddress.setAddress(userAddress);
    }

}
