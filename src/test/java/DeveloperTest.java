import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    
    private Developer dev;
    
    @Before
    public void before() {
        dev = new Developer("Robbie", "FG120919G", 30000);
    }

    @Test
    public void canRaiseSalary() {
        dev.raiseSalary(1500);
        assertEquals(31500, dev.getSalary(), 0.001);
    }

    @Test
    public void cannotRaiseSalaryToANegativeValue() {
        dev.raiseSalary(-1000);
        assertEquals(30000, dev.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, dev.payBonus(), 0.001);
    }

    @Test
    public void canChangeName() {
        dev.setName("Billy-Boy");
        assertEquals("Billy-Boy", dev.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        dev.setName(null);
        assertEquals("Robbie", dev.getName());
    }
}
