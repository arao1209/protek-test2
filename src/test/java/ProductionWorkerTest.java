import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProductionWorkerTest {

    @Test
    void setShiftTest(){

        ProductionWorker productionWorker = new ProductionWorker();
        productionWorker.setShift(1);
        int returnedShift = productionWorker.getShift();

        assertEquals(1, returnedShift);

    }

    @Test
    void setShiftFailTest(){

        ProductionWorker productionWorker = new ProductionWorker();
        productionWorker.setShift(3);

        assertEquals(0, productionWorker.getShift());


    }
}
