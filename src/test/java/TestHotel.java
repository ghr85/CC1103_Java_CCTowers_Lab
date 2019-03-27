import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestHotel {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(3, 2, "double");
        conferenceRoom = new ConferenceRoom("Balmoral Suite", 25);
        guest = new Guest("Billy Boner");
    }

    @Test
    public void startWithEmptyBedRoom() {
        assertEquals(0, hotel.getBedroomCount());
    }

    @Test
    public void startWithEmptyConferenceRoom() {
        assertEquals(0, hotel.getConferenceRoomCount());
    }

    @Test
    public void checkAddBedRoomToHotel() {
        hotel.addBedRoomToHotel(bedroom);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void checkAddConferenceRoomToHotel() {
        hotel.addConferenceRoomToHotel(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void canCheckInGuestToBedRoom() {
        hotel.addBedRoomToHotel(bedroom);
        hotel.checkInGuestToBedRoom(guest);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void canCheckInGuestToConferenceRoom() {
        hotel.addConferenceRoomToHotel(conferenceRoom);
        hotel.checkInGuestToConferenceRoom(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

}
