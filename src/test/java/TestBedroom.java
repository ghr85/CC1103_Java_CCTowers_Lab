import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBedroom {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 2, "double");
        guest = new Guest("Davie Dipstick");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }


    @Test
    public void hasBedroomType() {
        assertEquals("double", bedroom.getBedroomType());
    }

    @Test
    public void startsWithEmptyGuestArrayList(){
        assertEquals(0,bedroom.getGuestCount());
    }

    @Test
    public void canAddGuestToRoom_positive(){
        bedroom.addGuest(guest);
        assertEquals(1,bedroom.getGuestCount());
    }
    @Test
    public void canAddGuestToRoom_negative(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2,bedroom.getGuestCount());
    }
}