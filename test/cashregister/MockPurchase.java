package cashregister;

public class MockPurchase extends Purchase {
    private String message;

    public MockPurchase(String message) {
        super(new Item[]{});
        this.message = message;
    }

    @Override
    public String asString() {
        return message;
    }
}
