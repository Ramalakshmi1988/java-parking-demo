package parking;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GarageTest {

    private Garage classUnderTest;
    private Car myCar;

    @Before
    public void setUp(){
        classUnderTest = new Garage();
        myCar = new Car(true, "Sp33DY");
    }

    @Test
    public void canScanCar(){
        //S

        //T
        assertTrue(classUnderTest.scanForPass(myCar));
    }

    @Test
    public void canAssignTime(){
        //S
        int hoursStayed = 5;
        myCar.setHoursStayed(hoursStayed);

        //T
        assertEquals(hoursStayed, myCar.getHoursStayed());
    }
    @Test
    public void canCalculateFee(){
        //S
        int hoursStayed = 5;
        int fee = 5;
        myCar.setHoursStayed(hoursStayed);

        assertEquals(hoursStayed * fee, myCar.getTotalFee());
    }
}
