import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void hasSheets(){
        Printer printer1 = new Printer(50, 12);
        assertEquals(50, printer1.getSheetTotal());
    }

    @Test
    public void printReducesSheets(){
        Printer printer1 = new Printer(50, 12);
        printer1.print(2, 5);
        assertEquals(40, printer1.getSheetTotal());
    }

    @Test
    public void printFailsIfInsufficientSheets(){
        Printer printer1 = new Printer(20,12);
        printer1.print(4, 6);
        assertEquals(20, printer1.getSheetTotal());
    }

    @Test
    public void printingReducesTonerAmount(){
        Printer printer1 = new Printer(20, 12);
        printer1.print(3,6);
        assertEquals(11, printer1.getTonerAmount());
    }
}
