package cashregister;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashRegisterTest {

    private static MockPrint mockPrint = null;
    private static CashRegister cashRegister = null;

    @BeforeAll
    private static void setup(){
        mockPrint = new MockPrint();
        cashRegister = new CashRegister(mockPrint);
    }

    @BeforeEach
    private void clear(){
        mockPrint.clear();
    }

    @Test
    @Disabled
    public void should_print_the_real_purchase_when_call_process() {
        //given
        Printer printer  = Mockito.mock(Printer.class);
        Purchase purchase = Mockito.mock(Purchase.class);

        cashRegister.process(purchase);
        //when
        //then
        assertEquals("test product\t1.0\n", mockPrint.getTempString());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        SubPurchase subPurchase = new SubPurchase();
        //when
        cashRegister.process(subPurchase);
        //then
        assertEquals("test product\t1.0\n", mockPrint.getTempString());
    }

    @Test
    @Disabled
    public void should_verify_with_process_call_with_mockito() {

        //given
        Item[] items = {new Item("test product", 1)};
        Purchase purchase = new Purchase(items);

        //when

        cashRegister.process(purchase);
        //then

        assertEquals("test product\t1.0\n", mockPrint.getTempString());
    }

}
