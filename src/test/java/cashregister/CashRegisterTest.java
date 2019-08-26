package cashregister;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        //when
        //then
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        //when
        //then
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {

        //given
        Item[] items = {new Item("test product", 1)};
        Purchase purchase = new Purchase(items);
        MockPrint mockPrint = new MockPrint();
        CashRegister cashRegister = new CashRegister(mockPrint);
        //when

        cashRegister.process(purchase);
        //then

        assertEquals("test product\t1.0\n", mockPrint.getTempString());
    }

}
