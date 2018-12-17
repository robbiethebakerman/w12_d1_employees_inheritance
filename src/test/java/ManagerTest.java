import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Ken","KL298765G", 40000.00, "QA");
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1500);
        assertEquals(41500, manager.getSalary(), 0.001);
    }

    @Test
    public void cannotRaiseSalaryToANegativeValue() {
        manager.raiseSalary(-1000);
        assertEquals(40000, manager.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, manager.payBonus(), 0.001);
    }

    @Test
    public void canChangeName() {
        manager.setName("Billy-Boy");
        assertEquals("Billy-Boy", manager.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        manager.setName(null);
        assertEquals("Ken", manager.getName());
    }
}
