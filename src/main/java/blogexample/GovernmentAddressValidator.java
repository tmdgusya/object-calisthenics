package blogexample;

public class GovernmentAddressValidator implements AddressValidator {
    @Override
    public boolean isValidate(Address address) {
        return true;
    }
}
