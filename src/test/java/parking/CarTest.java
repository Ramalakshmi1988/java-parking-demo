package parking;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
    private Car classUnderTest;

    @Before
    public void setUp(){
        this.classUnderTest = new Car(true, "SP33DY");
    }

    @Test
    public void hasMonthlyPass(){
        assertTrue(classUnderTest.isHasPass());
    }
//
//    @Test
//    public void hasLicensePlate(){
//
//    }
}
