package blogexample;

public class User {

    private String name;
    private Address address;
    private AddressValidator addressValidator;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setAddress(String addressDetail, Integer zipcode) {
        address.addressDetail = addressDetail;
        address.zipCode = zipcode;
        if (!addressValidator.isValidate(address)) {
            throw new IllegalArgumentException("주소를 다시 확인해주세요");
        }
    }

}
