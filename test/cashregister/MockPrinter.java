package cashregister;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MockPrinter extends Printer {

    private boolean isCalled = false;
    private String message;

    @Override
    public void print(String printThis) {
        isCalled = true;
        message = printThis;
    }

    public void verify(String param) {
        assertTrue(isCalled);
        assertEquals(param, message);
    }
}
