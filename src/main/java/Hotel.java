import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }


    public int getBedroomCount() {
        return this.bedrooms.size();
    }

    public int getConferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addBedRoomToHotel(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuestToBedRoom(Guest guest) {
        Bedroom checkin = this.bedrooms.get(0);
        checkin.addGuest(guest);
    }

    public void checkInGuestToConferenceRoom(Guest guest) {
        ConferenceRoom checkin = this.conferenceRooms.get(0);
        checkin.addGuest(guest);
    }



}
