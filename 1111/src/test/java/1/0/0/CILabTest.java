import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        // evaluate a false - no capital letters
        CILab ciLab = new CILab();
        ciLab.setString("no capital letters here.");
        assertFalse(ciLab.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest2() {
        // evaluate a true - capital letters present
        CILab ciLab = new CILab();
        ciLab.setString("there are some CAPITAL letters.");
        assertTrue(ciLab.detectCapitalUse());
    }


}
