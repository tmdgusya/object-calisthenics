package blogexample;

public class Address {
    private String addressDetail;
    private Integer zipCode;
    private AddressValidator addressValidator;

    public Address(String addressDetail, Integer zipCode, AddressValidator addressValidator) {
        this.addressDetail = addressDetail;
        this.zipCode = zipCode;
        this.addressValidator = addressValidator;
    }

    public void setAddress(Address address) {
        if (addressValidator.isValidate(address)) {
            throw new IllegalArgumentException("주소를 다시 확인해주세요");
        }
        this.addressDetail = address.addressDetail;
        this.zipCode = address.zipCode;
    }

}
