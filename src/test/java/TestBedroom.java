import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBedroom {
    Bedroom bedroom;
    Guest guest;
    @Before
    public void before(){
        bedroom = new Bedroom(1,2,"double");
        guest = new Guest("Davie Dipstick");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1,bedroom.getRoomNumber());
    }
}
