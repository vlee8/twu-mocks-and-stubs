package cashregister;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashRegisterTest {

    @Test
    public void shouldPrintabcGivenabcInput() {
        MockPrinter mockPrinter = new MockPrinter();
        CashRegister cashRegister = new CashRegister(mockPrinter);
        MockPurchase mockPurchase = new MockPurchase("abc");

        cashRegister.process(mockPurchase);

        mockPrinter.verify("abc");
    }

    @Test
    public void shouldPrint123Given123Input() {
        MockPrinter mockPrinter = new MockPrinter();
        CashRegister cashRegister = new CashRegister(mockPrinter);
        MockPurchase mockPurchase = new MockPurchase("123");

        cashRegister.process(mockPurchase);

        mockPrinter.verify("123");
    }

}