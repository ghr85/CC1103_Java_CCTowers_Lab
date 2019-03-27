import java.util.ArrayList;

public class ConferenceRoom {
    private String roomName;
    private Integer capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String roomName, Integer capacity){
        this.roomName = roomName;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }
    public String getRoomName() {
        return this.roomName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGuestCount(){
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.checkCapacity()) {
            this.guests.add(guest);
        }
    }
    public boolean checkCapacity() {
        if (this.guests.size() < this.capacity){
            return true;
        } else {
            return false;
        }
    }

    public void removeGuest() {
        this.guests.remove(0);
    }

    public void vacateAllGuests() {
        this.guests.clear();
    }
}

