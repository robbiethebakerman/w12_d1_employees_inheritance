import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin dba;

    @Before
    public void before() {
        dba = new DatabaseAdmin("Martin", "FM155619G", 55000);
    }

    @Test
    public void canRaiseSalary() {
        dba.raiseSalary(1500);
        assertEquals(56500, dba.getSalary(), 0.001);
    }

    @Test
    public void cannotRaiseSalaryToANegativeValue() {
        dba.raiseSalary(-1000);
        assertEquals(55000, dba.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(550, dba.payBonus(), 0.001);
    }

    @Test
    public void canChangeName() {
        dba.setName("Billy-Boy");
        assertEquals("Billy-Boy", dba.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        dba.setName(null);
        assertEquals("Martin", dba.getName());
    }
}
