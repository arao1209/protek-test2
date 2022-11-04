import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmplyeeTest {


    @Test
    void setNumberTest() {

        Employee employee = new Employee();
        employee.setNumber("012-A");
        String returnedNUmber = employee.getNumber();

        assertEquals("012-A", returnedNUmber);
    }

    @Test
    void setNumberFailTest() {

        Employee employee = new Employee();
        String verifiedString = "AAC--";
        UnsupportedNumberFormatException exception = assertThrows(UnsupportedNumberFormatException.class, () -> employee.setNumber(verifiedString));

        String expectedMessage = "Not A Valid Employee Number Format...It should be in 'XXX-L' format, XXX should be in (0-9) and L should be [A-M]: "+verifiedString;

        assertEquals(expectedMessage, exception.getMessage());
    }


}
