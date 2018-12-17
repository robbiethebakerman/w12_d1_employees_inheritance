import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("The Man", "BI291348W", 100000, 2500000);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(105000, director.getSalary(), 0.001);
    }

    @Test
    public void cannotRaiseSalaryToANegativeValue() {
        director.raiseSalary(-1000);
        assertEquals(100000, director.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(2000, director.payBonus(), 0.001);
    }

    @Test
    public void canChangeName() {
        director.setName("Billy-Boy");
        assertEquals("Billy-Boy", director.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        director.setName(null);
        assertEquals("The Man", director.getName());
    }
}
