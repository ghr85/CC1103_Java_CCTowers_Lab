import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestConferenceRoom {
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Pilton Heights", 12);
        guest = new Guest("Davie Dipstick");
    }

    @Test
    public void hasRoomName() {
        assertEquals("Pilton Heights", conferenceRoom.getRoomName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(12, conferenceRoom.getCapacity());
    }


    @Test
    public void startsWithEmptyGuestArrayList(){
        assertEquals(0,conferenceRoom.getGuestCount());
    }

    @Test
    public void canAddGuestToRoom_positive(){
        conferenceRoom.addGuest(guest);
        assertEquals(1,conferenceRoom.getGuestCount());
    }
    @Test
    public void canAddGuestToRoom_negative(){
        for(int i = 0; i <14; i++) {
            conferenceRoom.addGuest(guest);
        }
        assertEquals(12,conferenceRoom.getGuestCount());
    }

    @Test
    public void canRemoveGuestfromConferenceRoom(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest();
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void canClearGuestsFromRoom(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.vacateAllGuests();
        assertEquals(0,conferenceRoom.getGuestCount());
    }
}
